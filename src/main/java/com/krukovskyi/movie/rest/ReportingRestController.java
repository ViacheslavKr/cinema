package com.krukovskyi.movie.rest;


import com.krukovskyi.movie.models.Cinema;
import com.krukovskyi.movie.models.reports.BoxOfficeReport;
import com.krukovskyi.movie.models.reports.GapReport;
import com.krukovskyi.movie.services.ReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/api/reports")
public class ReportingRestController {

    @Autowired
    private ReportingService service;


    @RequestMapping(method = RequestMethod.GET, value = "/cinema")
    @ResponseBody
    public List<Cinema> getCinemaGreaterThanShowing(@RequestParam("showingThreshold") Long showingThreshold,
                                                    @RequestParam("beginDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date beginDate,
                                                    @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return service.findCinemaByShowings(showingThreshold, beginDate, endDate);

    }

    @RequestMapping(method = RequestMethod.GET, value = "/{cinemaId}/gaps")
    @ResponseBody
    public GapReport getCinemaShowingGaps(@PathVariable Long cinemaId,
                                          @RequestParam("beginDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date beginDate,
                                          @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {


        return service.findCinemaShowingGaps(cinemaId, beginDate, endDate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/box/{cinemaId}/{movieId}")
    @ResponseBody
    public BoxOfficeReport getBoxOffice(@PathVariable Long cinemaId, @PathVariable Long movieId,
                                        @RequestParam("beginDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date beginDate,
                                        @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return service.getBoxOffice(cinemaId, movieId, beginDate, endDate);
    }

}