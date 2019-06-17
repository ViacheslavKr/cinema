package com.krukovskyi.movie.repositories;

import com.krukovskyi.movie.models.BoxOffice;
import com.krukovskyi.movie.models.Cinema;
import com.krukovskyi.movie.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface BoxOfficeRepository extends JpaRepository<BoxOffice, Long> {
    List<BoxOffice> findAllByCinemaAndMovieAndShowingDateBetweenOrderByShowingDate(Cinema cinema, Movie movie, Date begin, Date end);
}
