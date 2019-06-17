package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Ticket;
import com.krukovskyi.movie.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository repository;

    @Override
    public Ticket save(Ticket ticket) {
        return repository.save(ticket);
    }

    @Override
    public Ticket get(long id) {
        return repository.getOne(1L);
    }
}
