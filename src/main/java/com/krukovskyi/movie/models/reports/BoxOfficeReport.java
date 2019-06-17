package com.krukovskyi.movie.models.reports;

import com.krukovskyi.movie.models.Cinema;
import com.krukovskyi.movie.models.Movie;

import java.math.BigDecimal;
import java.util.List;

public class BoxOfficeReport {
    private Cinema cinema;
    private Movie movie;
    private BigDecimal totalBoxOffice;
    private BigDecimal totalBoxAmount;

    private List<BoxOfficeDetailsRecord> boxOfficeDetails;

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public BigDecimal getTotalBoxOffice() {
        return totalBoxOffice;
    }

    public void setTotalBoxOffice(BigDecimal totalBoxOffice) {
        this.totalBoxOffice = totalBoxOffice;
    }

    public BigDecimal getTotalBoxAmount() {
        return totalBoxAmount;
    }

    public void setTotalAmount(BigDecimal totalBoxAmount) {
        this.totalBoxAmount = totalBoxAmount;
    }

    public List<BoxOfficeDetailsRecord> getBoxOfficeDetails() {
        return boxOfficeDetails;
    }

    public void setBoxOfficeDetails(List<BoxOfficeDetailsRecord> boxOfficeDetails) {
        this.boxOfficeDetails = boxOfficeDetails;
    }
}
