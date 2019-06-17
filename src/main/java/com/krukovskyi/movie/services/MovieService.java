package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getByTitle(String title);

    Movie save(Movie newMovie);
}
