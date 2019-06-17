package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Movie;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieServiceTest {
    @Autowired
    private MovieService service;

    @Test
    public void getByTitleFewMatches() {
        String titleSubstring = "future";
        List<Movie> result = service.getByTitle(titleSubstring);
        assertEquals(3, result.size());
        assertTrue(result.get(0).getTitle().contains(titleSubstring));
        assertTrue(result.get(1).getTitle().contains(titleSubstring));
        assertTrue(result.get(2).getTitle().contains(titleSubstring));
    }

    @Test
    public void getByTitleNoMatches() {
        String titleSubstring = "past";
        List<Movie> result = service.getByTitle(titleSubstring);
        assertTrue(result.isEmpty());

    }

    @Test
    public void getByTitleCaseInsensitive() {
        String titleSubstring = "aVataR";
        List<Movie> result = service.getByTitle(titleSubstring);
        assertEquals(1, result.size());

    }

    @Test
    public void addNewMovie() {

        Movie newMovie = new Movie();
        newMovie.setDuration(5000L);
        newMovie.setTitle("Valerian and the City of a Thousand Planets");
        service.save(newMovie);

        List<Movie> result = service.getByTitle("Valerian and the City of a Thousand Planets");

        Assert.assertNotNull(result.get(0));

    }


}
