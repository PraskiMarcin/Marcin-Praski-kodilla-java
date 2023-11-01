package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String continentName;
    private final List<Country> listOfCountry = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountry() {
        return listOfCountry;
    }

    public boolean addCountry (Country country){
        return listOfCountry.add(country);
    }
}
