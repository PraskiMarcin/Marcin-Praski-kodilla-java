package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String name = "circle";

    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 3.14 *circleRadius * circleRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circleRadius, circle.circleRadius) != 0) return false;
        return Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(circleRadius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
