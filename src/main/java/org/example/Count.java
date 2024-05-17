package org.example;

public class Count {
    public static void countWords(String str) {
        String[] words = str.split(" ");
        System.out.println("The sentence has " + words.length + " words: ");
    }

    static void countCharacters(String str){

        // Create a char array of given String
        char[] chr = str.toCharArray();
        for(int i = 0; i < chr.length; i++) {

            //Declare a String with empty initialization
            String s = "";

            //When the character is not space
            while (i < chr.length && chr[i] != ' '){

                //Concat with the declared String
                s = s + chr[i];
                i++;
            }
            if (s.length() > 0) {
                System.out.print(s + " has " + s.length() +" characters.\n");
            }
        }
    }
}

