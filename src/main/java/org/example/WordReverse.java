package org.example;

public class WordReverse {
    public static String ReverseWordsInString (String string) {
    String[] stringArray = string.split(" ");
    String reverseArray  = "";
    for (int i = stringArray.length - 1; i >= 0; i--){
       reverseArray += stringArray[i];
       if (i != 0){
           reverseArray += " ";
       }
    }
    return reverseArray;
    }
}
