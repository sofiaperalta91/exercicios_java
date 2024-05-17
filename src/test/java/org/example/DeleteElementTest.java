package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertThrows;

public class DeleteElementTest extends TestCase {
    @Test
    public void testDeleteIndex3OfArrayEquals() {

        //Arrange
        int[] inicialArray = {4, 2, 3, 4};
        int index = 3;
        String expected = "Original Array: [4, 2, 3, 4]\nNew Array: [4, 2, 3]";

        //Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //capture output
        System.setOut(new PrintStream(outputStream));
        DeleteElement.DeleteIndex3OfArray(inicialArray, index);
        String result = outputStream.toString().trim();

        //Assert
        assertEquals(expected,result);

    }
   @Test
    public void testDeleteIndex3OfArrayShortArray() {

        //Arrange
        int[] shortArray = {4, 2, 3};
        int index = 3;
        String expected = "Array does not have an index 3.";

        //Act
       Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
           DeleteElement.DeleteIndex3OfArray(shortArray, index);
       });

        //Assert
        assertEquals(expected,exception.getMessage());

    }

}