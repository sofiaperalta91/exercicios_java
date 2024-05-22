package org.example;

public class LeftRotateArray {
    public static int[] leftRotateIntArrayByOnePosition(int[] array, int position){
        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length - position; i++){
           newArray[i] = array[i + position];
        }
        for(int i = 0 ; i < position; i++){
            newArray[array.length - position + i] = array[i];
        }
        return newArray;
    }
}
