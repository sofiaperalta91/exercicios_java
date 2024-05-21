package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class WordReverseTest extends TestCase {
    @Test
    public void testWordReverseEquals() {
        //Arrange
        String str = "My name is Sofia";
        String expected = "Sofia is name My";

        //Act
        String result = WordReverse.ReverseWordsInString(str);

        //Assert
        assertEquals(expected, result);
    }
    @Test
    public void testWordReverseNotEquals() {
        //Arrange
        String str = "My name is Sofia";

        //Act
        String result = WordReverse.ReverseWordsInString(str);

        //Assert
        assertNotEquals(str, result);
    }

}