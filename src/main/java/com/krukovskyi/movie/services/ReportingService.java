package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Cinema;
import com.krukovskyi.movie.models.reports.BoxOfficeReport;
import com.krukovskyi.movie.models.reports.GapReport;

import java.util.Date;
import java.util.List;

public interface ReportingService {
    List<Cinema> findCinemaByShowings(Long showingThreshold, Date startTime, Date endTime);

    GapReport findCinemaShowingGaps(Long cinemaId, Date beginDate, Date endDate);

    BoxOfficeReport getBoxOffice(Long cinemaId, Long movieId, Date beginDate, Date endDate);
}
