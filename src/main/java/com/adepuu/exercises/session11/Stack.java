package com.adepuu.exercises.session11;

import java.util.LinkedList;

public class Stack<T> {
    /**
     * Write a Java stack program that can scale dynamically
     * <p>
     * As a developer, I want to implement a Java stack program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
     * Notes:
     * The program doesn't require a menu system; focus should be on data structure implementation.
     * <p>
     * Acceptance Criteria:
     * - Functionality: The program must be able to perform basic stack operations (push, pop, peek) on a linked list.
     * - Dynamic Scaling: The stack should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
     * - Performance: The program should maintain constant time complexity for push and pop operations, ensuring efficient data management.
     * - Memory Efficiency: The stack should use memory efficiently, allocating and deallocating memory dynamically as needed.
     * - Error Handling: The program should handle edge cases gracefully, such as attempting to pop an element from an empty stack, and provide clear error messages.
     */
    
        private LinkedList<T> list;
        
        public Stack() {
            this.list = new LinkedList<>();
        }

        public void push(T data) {
            list.addFirst(data);
        }

        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("stack is empty");
            }
            return list.removeFirst();
        }

        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("stack is empty");
            }
            return list.getFirst();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int size() {
            return list.size();
        }

     public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("size of stack = " + stack.size());
        System.out.println("top of elements = " + stack.peek());

        System.out.println("pop elements : ");
        System.out.println(stack.pop());
        System.out.println("top of elements curent = " + stack.peek());
        System.out.println("size after popping = " + stack.size());
    }
}
