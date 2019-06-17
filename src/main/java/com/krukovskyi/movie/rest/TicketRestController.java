package com.krukovskyi.movie.rest;

import com.krukovskyi.movie.models.Ticket;
import com.krukovskyi.movie.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/tickets")
public class TicketRestController {
    @Autowired
    private TicketService service;

    @PostMapping
    @ResponseBody
    Ticket newShowing(@RequestBody Ticket newTicket) {

        return service.save(newTicket);
    }

    @GetMapping
    @ResponseBody
    Ticket getTicket() {
        return service.get(1L);
    }
}
