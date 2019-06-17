package com.krukovskyi.movie.rest;

import com.krukovskyi.movie.models.Movie;
import com.krukovskyi.movie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/movies")
public class MovieRestController {
    @Autowired
    MovieService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{title}")
    @ResponseBody
    public List<Movie> getCinemaGreaterThanShowing(@PathVariable  String title) {
        return service.getByTitle(title);

    }

    @PostMapping
    @ResponseBody
    Movie addMovie(@RequestBody Movie newMovie) {
        return service.save(newMovie);
    }
}
