package com.adepuu.exercises.session6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    /**
     * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
     *
     * Input: 1, 2, 3, 4, 5, q
     * Output: 3
     *
     * Input: 1, 2, 3, a, b, 4, 5, q
     * Output: 3
     *
     * Explanation: print “Invalid input. Please enter a valid number or 'q' to finish.” if user not inserting the expected number or character.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        boolean condition = true;

        while (condition) {
            System.out.println("input data = ");
            String numbers = scanner.nextLine();
            if (numbers.equalsIgnoreCase("q")) {
                break;
            }
            values.add(numbers);
        }

        for (String container : values) {
            System.out.println(container);
        }

        ArrayList<Integer> numbersOnly = new ArrayList<>();
        for (String str : values) {
            for (char charNumber : str.toCharArray()) {
                if (Character.isDigit(charNumber)) {
                    int num = Character.getNumericValue(charNumber);
                    numbersOnly.add(num);
                }
            }
        }

        System.out.println("numbers only = ");
        for (int num : numbersOnly) {
            System.out.println(num);
        }

        int sum = 0;
        for (int num : numbersOnly) {
            sum += num;
        }

        System.out.println("average is = ");
        double average = (double) sum / numbersOnly.size();
        System.out.println(average);

        scanner.close();
    }
}
