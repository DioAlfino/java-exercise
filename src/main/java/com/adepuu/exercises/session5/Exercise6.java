package com.adepuu.exercises.session5;


public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 5, 1};
        int key = 1;
        printValue(numbers, key);
    }


public static void printValue (int[] numbers, int key){
    for (int value : numbers){
        if (value != key) {
            System.out.println(value);
        }
    }
}
}
