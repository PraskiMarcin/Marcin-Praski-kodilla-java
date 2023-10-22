package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private String name = "triangle";
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }


    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 0.5* a * h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(a, triangle.a) != 0) return false;
        return Double.compare(h, triangle.h) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
