package com.krukovskyi.movie.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Subselect("SELECT * FROM SHOWING_VIEW")
@Immutable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BoxOffice {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    private BigDecimal box;
    private BigDecimal amount;
    @Column(name = "S_TYPE")
    @Enumerated(EnumType.ORDINAL)
    private ShowingType showingType;

    @Basic
    @Column(name = "sdate", nullable = false)
    private Timestamp showingDate;

    public BoxOffice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public BigDecimal getBox() {
        return box;
    }

    public void setBox(BigDecimal box) {
        this.box = box;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public ShowingType getShowingType() {
        return showingType;
    }

    public void setShowingType(ShowingType showingType) {
        this.showingType = showingType;
    }

    public Timestamp getShowingDate() {
        return showingDate;
    }

    public void setShowingDate(Timestamp showingDate) {
        this.showingDate = showingDate;
    }
}
