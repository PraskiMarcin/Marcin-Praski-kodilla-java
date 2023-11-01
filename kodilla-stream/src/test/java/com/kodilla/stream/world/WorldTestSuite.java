package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Country poland = new Country("Poland");
        Country germany = new Country("Germany");
        Country italy = new Country("Italy");
        Country japan = new Country("Japan");
        Country china = new Country("China");
        Country india = new Country("India");
        Country nigeria = new Country("Nigeria");
        Country kenya = new Country("Kenya");
        Country morocco = new Country("Morocco");
        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(africa);

        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(italy);
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(india);
        africa.addCountry(nigeria);
        africa.addCountry(kenya);
        africa.addCountry(morocco);

        //When
        BigDecimal result1 = world.getPeopleQuantity();

        //Then
        BigDecimal result2 = new BigDecimal("21082889297268");
        Assertions.assertEquals(result1, result2);

    }
}
