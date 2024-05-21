package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;


public class IntReverseTest extends TestCase {
    @Test
    public void testReverseIntInAnArrayEquals() {

        //Arrange
        int[] intArray = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        //Act
        int[] result = IntReverse.ReverseIntInAnArray(intArray);

        //Assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void testReverseIntInAnArrayNotEquals() {

        //Arrange
        int[] intArray = {1, 2, 3, 4, 5};

        //Act
        int[] result = IntReverse.ReverseIntInAnArray(intArray);

        //Assert
       assertNotEquals(intArray, result);
    }
}