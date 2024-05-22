package org.example;

import static org.example.Count.countCharacters;
import static org.example.Count.countWords;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// 1. Write a java program to find number of words in a sentence and the corresponding character.

        String str = "Hello World";
        countWords(str);
        countCharacters(str);


// 2. Delete an element from an array.

        int[] array = {1,2,3,4,5};
        int index = 2;
        DeleteElement.DeleteIndex3OfArray(array,index);

// 3. How to read a matrix from console

        MatrixDemo.MatrixFromConsole();

// 4. Reverse words in a String.

        String strg = "My name is Sofia";
        WordReverse.ReverseWordsInString(strg);

// 5. Reverse elements in an array of int.

        IntReverse.ReverseIntInAnArray(array);

//6. Insert an element in an array of int at a specific position.

        int elementToInsert = 8;
       InsertIntArray.InsertIntArraySpecificIndex(array, index, elementToInsert);






    }



}