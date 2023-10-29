package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()   // [1]
                .filter(book -> book.getYearOfPublication() > 2005)                  // [2]
                .collect(Collectors.toList());                                       // [3]

        System.out.println("# elements: " + theResultListOfBooks.size());       // [4]
        theResultListOfBooks.stream()                                           // [5]
                .forEach(System.out::println);


//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        People.getList().stream()
//                .forEach(System.out::println);


//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        String result1 = poemBeautifier.beautify("przykładowy TEXT", text -> "ABC" + text + "ABC");
//        System.out.println(result1);
//        String result2 = poemBeautifier.beautify("przykładowy TEXT", String::toUpperCase);
//        System.out.println(result2);
//        String result3 = poemBeautifier.beautify("przykładowy TEXT", String::toLowerCase);
//        System.out.println(result3);
//        String result4 = poemBeautifier.beautify("przykładowy TEXT", text -> text + " oraz inny text");
//        System.out.println(result4);
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
    }

}