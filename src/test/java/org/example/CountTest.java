package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertNotEquals;

public class CountTest extends TestCase {

    @Test
    public void testCountWordsEquals() {

       //Arrange
        String str = "Hello World";
        String expected = "The sentence has 2 words:";

       //Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //capture output
        System.setOut(new PrintStream(outputStream));
        Count.countWords(str);
        String result = outputStream.toString().trim();

        //Assert
        assertEquals(expected,result);
    }
    @Test
    public void testCountWordsNotEquals() {

        //Arrange
        String str = "Hello World";
        String expected = "The sentence has 3 words:";

        //Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //capture output
        System.setOut(new PrintStream(outputStream));
        Count.countWords(str);
        String result = outputStream.toString().trim();

        //Assert
        assertNotEquals(expected,result);
    }



    @Test
    public void testCountCharactersCharactersEquals() {

        //Arrange
        String str = "Hello World";
        String expected = "Hello has 5 characters.\n" + "World has 5 characters.";

        //Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //capture output
        System.setOut(new PrintStream(outputStream));
        Count.countCharacters(str);
        String result = outputStream.toString().trim();

        //Assert
        assertEquals(expected,result);
    }
    @Test
    public void testCountCharactersCharactersNotEquals() {

        //Arrange
        String str = "Hello World";
        String expected = "Hello has 3 characters.\n" + "World has 5 characters.";

        //Act
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //capture output
        System.setOut(new PrintStream(outputStream));
        Count.countCharacters(str);
        String result = outputStream.toString().trim();

        //Assert
        assertNotEquals(expected,result);
    }
}