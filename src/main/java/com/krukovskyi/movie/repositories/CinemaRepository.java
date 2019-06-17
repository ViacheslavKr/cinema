package com.krukovskyi.movie.repositories;

import com.krukovskyi.movie.models.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    @Query("select c from Cinema c " +
            "join Showing s  on c.id = s.cinema  " +
            "WHERE s.beginTime between :beginTime and  :endTime " +
            "and s.endTime <=:endTime " +
            "group by c.id " +
            "HAVING  count(s) > :showingThreshold")
    List<Cinema> getCinemaGreaterThanShowing(@Param("showingThreshold") Long showingThreshold
            , @Param("beginTime") Date begin, @Param("endTime") Date end);
}
