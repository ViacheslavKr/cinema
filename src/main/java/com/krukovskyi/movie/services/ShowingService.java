package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Showing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tickets")
public interface ShowingService {
    Showing save(Showing showing);

    Showing get(long id);
}
