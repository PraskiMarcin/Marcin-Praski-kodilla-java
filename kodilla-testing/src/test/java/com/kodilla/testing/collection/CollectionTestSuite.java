package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("check the empty list"
    )

    @Test
    public void testOddNumbersExterminatorEmptyList(){
            //Given
            OddNumbersExterminator exterminator = new OddNumbersExterminator();
            ArrayList<Integer> emptyList = new ArrayList<>();

            //When
            List<Integer> resultList = exterminator.exterminate(emptyList);

            //Then
            assertEquals(emptyList, resultList);
    }

    @DisplayName("checking whether the class behaves correctly when the list contains even and odd numbers"
    )

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> examplesList = new ArrayList<>();
        examplesList.add(-3);
        examplesList.add(-6);
        examplesList.add(4);
        examplesList.add(0);
        examplesList.add(1);
        examplesList.add(4);
        examplesList.add(7);

        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(-6);
        expectedList.add(4);
        expectedList.add(0);
        expectedList.add(4);

        //When
        List<Integer> resultList = exterminator.exterminate(examplesList);

        //Then
        assertEquals(expectedList, resultList);
    }
}
