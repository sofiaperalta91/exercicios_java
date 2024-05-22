package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class InsertIntArrayTest extends TestCase {
    @Test
    public void testInsertIntArraySpecificIndexEquals() {
        //Arrange
        int[] array = {1,2,3,4,5};
        int index = 2;
        int elementToInsert = 8;
        int[] expected = {1,2,8,3,4,5};

        //Act
        int[] result = InsertIntArray.InsertIntArraySpecificIndex(array,index,elementToInsert);

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void testInsertIntArraySpecificIndexNotEquals() {
        //Arrange
        int[] array = {1,2,3,4,5};
        int index = 2;
        int elementToInsert = 8;
        int[] expected = {1,2,3,4,8,5};

        //Act
        int[] result = InsertIntArray.InsertIntArraySpecificIndex(array,index,elementToInsert);

        //Assert
        assertNotEquals(expected, result);
    }
}