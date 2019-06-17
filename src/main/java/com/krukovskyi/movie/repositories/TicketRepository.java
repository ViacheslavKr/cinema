package com.krukovskyi.movie.repositories;

import com.krukovskyi.movie.models.Cinema;
import com.krukovskyi.movie.models.Showing;
import com.krukovskyi.movie.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;


public interface TicketRepository extends JpaRepository<Ticket, Long> {

}