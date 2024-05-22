package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class LeftRotateArrayTest extends TestCase {

    @Test
    public void testLeftRotateIntArrayByOnePosition_Equals() {
        //Arrange
        int[] array = {1,2,3,4,5};
        int position = 2;
        int[] expected = {3,4,5,1,2};

        //Act
        int[] result = LeftRotateArray.leftRotateIntArrayByOnePosition(array, position);

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void testLeftRotateIntArrayByOnePosition_NotEquals() {
        //Arrange
        int[] array = {1,2,3,4,5};
        int position = 2;

        //Act
        int[] result = LeftRotateArray.leftRotateIntArrayByOnePosition(array, position);

        //Assert
        assertNotEquals(array, result);
    }

}