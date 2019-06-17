package com.krukovskyi.movie.rest;

import com.krukovskyi.movie.models.Showing;
import com.krukovskyi.movie.services.ShowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/showings")
public class ShowingRestController {
    @Autowired
    private ShowingService service;

    @GetMapping
    @ResponseBody
    Showing getShowing() {
        return service.get(1L);
    }

    @PostMapping
    @ResponseBody
    Showing newShowing(@RequestBody Showing newShowing) {
        return service.save(newShowing);
    }

}
