package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private String name = "square";
    private double a;

    public Square(double a) {
        this.a = a;
   }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return a * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(a, square.a) != 0) return false;
        return Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
