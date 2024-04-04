package com.adepuu.exercises.session11;

import java.util.LinkedList;

public class Queue<T> {
    /**
     * Write a Java queue program that can scale dynamically
     * <p>
     * As a developer, I want to implement a Java queue program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
     * <p>
     * Notes:
     * The program doesn't require a menu system; focus should be on data structure implementation.
     * <p>
     * Acceptance Criteria:
     * - Functionality: The program must be able to perform basic queue operations (enqueue, dequeue, peek) on a linked list.
     * - Dynamic Scaling: The queue should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
     * - Performance: The program should maintain constant time complexity for enqueue and dequeue operations, ensuring efficient data management.
     * - Memory Efficiency: The queue should use memory efficiently, allocating and deallocating memory dynamically as needed.
     * - Error Handling: The program should handle edge cases gracefully, such as attempting to dequeue an element from an empty queue, and provide clear error messages.
     */
    private LinkedList<T> list;

    public Queue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(T data) {
        list.addFirst(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        return list.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
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
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("size of queue = " + queue.size());
        System.out.println("top of queue = " + queue.peek());

        System.out.println("popping queue = " + queue.dequeue());
        System.out.println("top of queue = " + queue.peek());

        System.out.println("queue size after popping = " + queue.size());
    }
}
