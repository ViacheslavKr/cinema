package com.krukovskyi.movie.models;

public enum ShowingType {

    MORNING("Morning"), DAY("Day"), EVENING("Evening"), NIGHT("Night");

    private String description;

    ShowingType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
