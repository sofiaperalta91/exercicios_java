package org.example;

public class IntReverse {
    public static int[] ReverseIntInAnArray (int[] array) {
        int [] reversedArray = new int[array.length];
        int i, j;
        for (i = array.length - 1, j = 0; i >= 0; i--, j++){
            reversedArray[j] = array[i];
            }
        return reversedArray;
        }
    }
