package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //GIVEN
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double expected = 10.5;
        //When
        double result = ArrayOperations.getAverage(array);

        Assert.assertEquals(expected, result, 0.0001);
    }
}
