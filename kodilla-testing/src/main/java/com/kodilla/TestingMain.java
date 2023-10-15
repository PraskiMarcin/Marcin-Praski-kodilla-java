package com.kodilla;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addAToB = calculator.add(25,10);
        int subtractAFromB = calculator.subtract(25,10);

        if (addAToB == 35){
            System.out.println("test addAToB OK");
        } else {
            System.out.println("Error!");
        }

        if (subtractAFromB == 15){
            System.out.println("test subtractAFromB OK");
        } else {
            System.out.println("Error!");
        }
    }
}