package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("testing showing figures")
    class TestShowFigures {
        @Test
        public void testShowFiguresEmptyCollector() {
            ShapeCollector shapeCollector = new ShapeCollector();
            String result = shapeCollector.showFigures();

            assertEquals("", result);
        }

        @Test
        public void testShowFigures() {
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square(5));
            shapeCollector.addFigure(new Circle(7));
            shapeCollector.addFigure(new Triangle(5, 7));
            shapeCollector.addFigure(new Circle(10));
            shapeCollector.addFigure(new Circle(27));

            String result = shapeCollector.showFigures();
            String expected = "square,circle,triangle,circle,circle";

            assertEquals(expected, result);
        }
    }

    @DisplayName("testing getting figures")
    @Nested
    class TestGetFigure{
        @Test
        public void testGetFigureOutRange() {
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square(5));
            shapeCollector.addFigure(new Circle(7));

            Shape result = shapeCollector.getFigure(2);

            assertNull(result);
        }

        @Test
        public void testGetFigureEmpty() {
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape result = shapeCollector.getFigure(0);

            assertNull(result);
        }

        @Test
        public void testGetFigure() {
            Circle shape = new Circle(7);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square(5));
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(new Triangle(3, 5));

            Shape result = shapeCollector.getFigure(1);

            assertEquals(shape, result);
        }
    }

    @DisplayName("testing adding figures")
    @Nested
    class TestAddFigure{
        @Test
        public void testAddFigure() {
            Triangle triangle = new Triangle(3, 5);
            Circle circle1 = new Circle(1);
            Circle circle2 = new Circle(2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle2);

            Shape result0 = shapeCollector.getFigure(0);
            Shape result1 = shapeCollector.getFigure(1);
            Shape result2 = shapeCollector.getFigure(2);
            Shape result3 = shapeCollector.getFigure(3);

            assertEquals(triangle, result0);
            assertEquals(circle1, result1);
            assertEquals(circle2, result2);
            assertNull(result3);
        }
    }


    @DisplayName("testing removing figures")
    @Nested
    class TestRemoveFigure{

        @Test
        public void testRemoveFigureExist() {
            Triangle triangle = new Triangle(3, 5);
            Circle circle1 = new Circle(1);
            Circle circle2 = new Circle(2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle2);

            shapeCollector.removeFigure(circle1);

            Shape result0 = shapeCollector.getFigure(0);
            Shape result1 = shapeCollector.getFigure(1);
            Shape result2 = shapeCollector.getFigure(2);
            Shape result3 = shapeCollector.getFigure(3);

            assertEquals(triangle, result0);
            assertEquals(circle1, result1);
            assertEquals(circle2, result2);
            assertNull(result3);
        }

        @Test
        public void testRemoveFigureNotExist() {
            Triangle triangle = new Triangle(3, 5);
            Circle circle1 = new Circle(1);
            Circle circle2 = new Circle(2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle2);

            shapeCollector.removeFigure(new Circle(3));

            Shape result0 = shapeCollector.getFigure(0);
            Shape result1 = shapeCollector.getFigure(1);
            Shape result2 = shapeCollector.getFigure(2);
            Shape result3 = shapeCollector.getFigure(3);
            Shape result4 = shapeCollector.getFigure(4);

            assertEquals(triangle, result0);
            assertEquals(circle1, result1);
            assertEquals(circle1, result2);
            assertEquals(circle2, result3);
            assertNull(result4);
        }
    }
}
