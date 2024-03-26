package com.adepuu.exercises.session5;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        int[] numbers = {4,3,2,7,8,2,3,1};
        printValue(numbers);
    }
    
    public static void printValue(int[] numbers) {
        boolean[] isDuplicate = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]) {
                    isDuplicate[j] = true;
                    System.out.println(numbers[i]);
                }
            }
        }
        for (int i =0; i < numbers.length; i++){
            if (isDuplicate[i]) {
                System.out.println(numbers[i]);
            }
        }
    }
}
