package org.example;

import java.util.Arrays;

public class DeleteElement {
    public static void DeleteIndex3OfArray(int[] firstArray, int index) {


        System.out.print("Original Array: " + Arrays.toString(firstArray));
        int[] secondArray = new int[firstArray.length - 1] ;

        if (firstArray.length - 1 < index) {
            throw new ArrayIndexOutOfBoundsException("Array does not have an index 3.");

        }

        for (int i = 0, x = 0; i < firstArray.length; i++) {
            if (i == index) {
            continue;
            }
            secondArray[x++] = firstArray[i];
        }
        System.out.print("\nNew Array: " + Arrays.toString(secondArray));
    }
}
