package com.adepuu.exercises.session5;

import java.util.HashSet;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 5};

        HashSet<Integer> uniqueNumber = new HashSet<>();
        for (int i = 0; i < numbers.length; i++){
            uniqueNumber.add(numbers[i]);
        }
    
        Integer[] output = new Integer[uniqueNumber.size()];
        var result = uniqueNumber.toArray(output);
        for (int value : result){
            System.out.println(value);
        }
    }
}
