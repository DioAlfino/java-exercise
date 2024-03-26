package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbersArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        int split = 2;
        for (int i = 0; i < split; i++) {
            numbersArray.add(numbersArray.getFirst());
            numbersArray.remove(numbersArray.getFirst());
        }
        System.out.println(numbersArray);
    }
}
