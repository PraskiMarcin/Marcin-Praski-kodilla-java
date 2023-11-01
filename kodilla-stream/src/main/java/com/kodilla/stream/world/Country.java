package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
   private final String name;
   private final BigDecimal peopleQantity = new BigDecimal("2342543255252");

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQantity() {
        return peopleQantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!Objects.equals(name, country.name)) return false;
        return Objects.equals(peopleQantity, country.peopleQantity);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (peopleQantity != null ? peopleQantity.hashCode() : 0);
        return result;
    }
}
