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
            System.out.print("input the number = ");
            String numbers = scanner.nextLine();
            if (numbers.equalsIgnoreCase("q")) {
                break;
            }
            values.add(numbers);

        } for (String numbersContainer : values) {
            System.out.println(numbersContainer);
        }

        ArrayList<Integer> numbersOnly = new ArrayList<>();

        for (String str : values) {
            for (char numbersOnly2 : str.toCharArray()){
                if (Character.isDigit(numbersOnly2)) {
                    try {
                        int num = Character.getNumericValue(numbersOnly2);
                        numbersOnly.add(num);
                    } catch (NumberFormatException e) {
                        System.out.println("invalid data " + e.getMessage());
                    }
                }
            }
        }
        System.out.println("numbers only = ");
        for (int number : numbersOnly) {
            System.out.println(number);
        }
        
        int sum = 0;
        for (int num : numbersOnly) {
            sum += num;
        }
        System.out.println("average is =");
        Double average = (double) (sum / numbersOnly.size());
        System.out.println(average);
        scanner.close();
    }
}
