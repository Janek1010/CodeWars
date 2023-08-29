package org.example;

/***
 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
 *
 * Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:
 *
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 * Note: For 4 or more names, the number in "and 2 others" simply increases.
 *
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static String whoLikesIt(String... names) {
        String answer = "";
        switch(names.length){
            case 0 -> answer = "no one likes this";
            case 1 -> answer = names[0] + " likes this";
            case 2 -> answer = names[0] + " and " + names[1] + " like this";
            case 3 -> answer = names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default -> answer = names[0] + ", " + names[1] + " and " + String.valueOf(names.length-2) + " others like this";
        }
        return answer;
    }
}