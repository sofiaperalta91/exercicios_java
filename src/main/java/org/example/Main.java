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

        int[] firstArray = {1,2,3,4,5};
        int index = 2;
        DeleteElement.DeleteIndex3OfArray(firstArray,index);




    }



}