package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Movie;
import com.krukovskyi.movie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository repository;

    @Override
    public List<Movie> getByTitle(String title) {
        Objects.requireNonNull(title, "Title must be not null");
        return repository.findByTitleIgnoreCaseContaining(title);
    }

    @Override
    public Movie save(Movie newMovie) {
        return repository.save(newMovie);
    }
}
