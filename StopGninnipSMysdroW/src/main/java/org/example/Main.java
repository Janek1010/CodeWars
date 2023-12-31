package org.example;

/***
 Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata).
 Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

 Examples:

 spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 spinWords( "This is a test") => returns "This is a test"
 spinWords( "This is another test" )=> returns "This is rehtona test"
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }

    public static String spinWords(String sentence) {

        String splitted[] = sentence.split(" ");
        StringBuilder strReturned = new StringBuilder();
        for (String s : splitted) {
            if (s.length() >= 5) {
               s = new StringBuilder(s).reverse().toString();
            }
            strReturned.append(s+" ");
        }
        return strReturned.toString().strip();
    }
}