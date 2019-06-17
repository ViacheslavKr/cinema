package com.krukovskyi.movie.services;


import com.krukovskyi.movie.models.BoxOffice;
import com.krukovskyi.movie.models.Cinema;
import com.krukovskyi.movie.models.Movie;
import com.krukovskyi.movie.models.reports.BoxOfficeDetailsRecord;
import com.krukovskyi.movie.models.reports.BoxOfficeReport;
import com.krukovskyi.movie.models.reports.GapReport;
import com.krukovskyi.movie.models.Showing;
import com.krukovskyi.movie.repositories.BoxOfficeRepository;
import com.krukovskyi.movie.repositories.CinemaRepository;
import com.krukovskyi.movie.repositories.MovieRepository;
import com.krukovskyi.movie.repositories.ShowingRepository;
import com.krukovskyi.movie.utils.DateUtils;
import com.krukovskyi.movie.utils.GapCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportingServiceImpl implements ReportingService {

    @Autowired
    private ShowingRepository showingRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private BoxOfficeRepository boxOfficeRepository;

     @Override
    public List<Cinema> findCinemaByShowings(Long showingThreshold, Date startTime, Date endTime) {
        return cinemaRepository.getCinemaGreaterThanShowing(showingThreshold, DateUtils.atStartOfDate(startTime), DateUtils.atStartOfNextDate(endTime));
    }

    @Override
    public GapReport findCinemaShowingGaps(Long cinemaId, Date beginDate, Date endDate) {

        Cinema cinema = cinemaRepository.getOne(cinemaId);

        List<Showing> showings = showingRepository.findAllByCinemaAndBeginTimeBetweenOrderByBeginTime(cinema,
                DateUtils.atStartOfDate(beginDate), DateUtils.atEndOfDate(endDate));


        GapReport report = new GapReport();
        report.setCinema(cinema);
        report.setStartDate(beginDate);
        report.setEndDate(endDate);
        report.setGaps(showings.stream().collect(GapCollector.collector()));

        return report;

    }

    @Override
    public BoxOfficeReport getBoxOffice(Long cinemaId, Long movieId, Date beginDate, Date endDate) {

        BoxOfficeReport result = new BoxOfficeReport();
        Cinema cinema = cinemaRepository.getOne(cinemaId);
        Movie movie = movieRepository.getOne(movieId);

        result.setCinema(cinema);
        result.setMovie(movie);

        List<BoxOffice> details = boxOfficeRepository.findAllByCinemaAndMovieAndShowingDateBetweenOrderByShowingDate(cinema, movie,
                DateUtils.atStartOfDate(beginDate),DateUtils.atEndOfDate(endDate));
        result.setBoxOfficeDetails(details.stream().
                map(i-> new BoxOfficeDetailsRecord(i.getShowingType().getDescription(),i.getBox(),i.getAmount())).
                collect(Collectors.toList()));

        result.setTotalAmount(details.stream().
                map(BoxOffice::getAmount).
                reduce(BigDecimal::add).
                get());

        result.setTotalBoxOffice(details.stream().
                map(BoxOffice::getBox).
                reduce(BigDecimal::add).
                get());
        return result;
    }


}