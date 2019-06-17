package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {
    Ticket save(Ticket showing);

    Ticket get(long id);
}
