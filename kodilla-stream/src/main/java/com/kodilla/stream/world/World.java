package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> listOfContinents = new ArrayList<>();

    public boolean addContinent (Continent continent){
        return listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal numberOfPeopleInTheWorld = listOfContinents.stream()
                .flatMap(people -> people.getListOfCountry().stream())
                .map(Country::getPeopleQantity)
                .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));
        return numberOfPeopleInTheWorld;
    }

}
