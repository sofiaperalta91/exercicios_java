package org.example;

public class InsertIntArray {
    public static int[] InsertIntArraySpecificIndex (int [] array, int index, int value) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = value;

            for (int i = index; i <array.length; i++){
                newArray[i+1] = array[i];
            }
            return newArray;
        }

    }
