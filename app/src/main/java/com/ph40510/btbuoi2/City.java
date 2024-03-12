package com.ph40510.btbuoi2;

public class City {
    private String id;
    private String name;
    private int population;
    private String country;

    public City() {
    }

    public City(String id, String name, int population, String country) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
