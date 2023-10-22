package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> elements = new ArrayList<>();


    public void addFigure(Shape shape){
        elements.add(shape);
    }
    public void removeFigure(Shape shape){
       elements.remove(shape);
    }
    public Shape getFigure(int n){
        if (n >= elements.size()){
            return null;
        }
        return elements.get(n);
    }
    public String showFigures(){
        if (elements.isEmpty()) {
            return  "";
        }

        String result = "";
        boolean addSeparator = false;
        for(Shape shape:elements){
            if (addSeparator){
                result +=",";
            }
            result += shape.getShapeName();
            addSeparator = true;
        }
        return result;
    }
}
