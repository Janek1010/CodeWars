package org.example;

import java.util.Arrays;

/***You get an array of numbers, return the sum of all of the positives ones.

 Example [1,-4,7,12] => 1 + 7 + 12 = 20

 Note: if there is nothing to sum, the sum is default to 0.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[] = {1,-4,7,12};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(p -> p > 0).sum();
    }
}