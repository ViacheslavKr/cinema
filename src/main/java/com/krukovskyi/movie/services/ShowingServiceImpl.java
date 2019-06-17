package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Showing;
import com.krukovskyi.movie.repositories.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowingServiceImpl implements ShowingService {

    @Autowired
    ShowingRepository repository;

    @Override
    public Showing save(Showing showing) {
        return repository.save(showing);
    }

    @Override
    public Showing get(long id) {
        return repository.getOne(id);
    }
}
