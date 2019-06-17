package com.krukovskyi.movie.repositories;

import com.krukovskyi.movie.models.Cinema;
import com.krukovskyi.movie.models.Showing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;


public interface ShowingRepository extends JpaRepository<Showing, Long> {
    List<Showing> findAllByCinemaAndBeginTimeBetweenOrderByBeginTime(Cinema cinema, Timestamp begin, Timestamp end);
}