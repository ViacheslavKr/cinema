package com.krukovskyi.movie.models.reports;

import com.krukovskyi.movie.models.Cinema;

import java.util.Date;
import java.util.List;

public class GapReport {
    private Date startDate;
    private Date endDate;
    private Cinema cinema;
    private List<String> gaps;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public List<String> getGaps() {
        return gaps;
    }

    public void setGaps(List<String> gaps) {
        this.gaps = gaps;
    }
}
