package com.adepuu.exercises.session11;

import java.util.Scanner;

public class BinarySearchTree {
    /**
     * Write a Java binary search tree program that can scale dynamically
     * <p>
     * As a user, I want to insert N-numbers into a binary search tree and then search for a specific number. After searching, the program should prompt me to search for another number without terminating.
     * <p>
     * Acceptance Criteria:
     * - The program should start by prompting the user to enter the number of elements (N) they wish to insert into the binary search tree.
     * - The program should then prompt the user to enter N numbers one by one.
     * <p>
     * Acceptance Criteria:
     * - The program should correctly insert each number into the binary search tree in a way that maintains the binary search tree properties (all nodes in the left subtree are less than the root, and all nodes in the right subtree are greater than the root).
     * - The program should handle duplicate numbers appropriately, either by ignoring them or by updating the existing node.
     * - After inserting all N-numbers, the program should prompt the user to enter a number to search for within the binary search tree.
     * - The program should perform a binary search to find the entered number, following the binary search tree properties.
     * - The program should display whether the number is found or not.
     * - The program should provide a clear and straightforward way for the user to exit the continuous search loop and terminate the program, such as entering a specific keyword or command.
     *
     */

        private static class Node {
            int data;
            Node left, right;
        
            public Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

        private Node root;

        public BinarySearchTree() {
            root = null;
        }

        public void insert(int data ){
            root = insertRec(root, data);
        }

        private Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }

            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data){
                root.right = insertRec(root.right, data);
            }
            return root;
        }

        public boolean search(int data) {
            return searchRec(root, data);
        }

        private boolean searchRec(Node root, int data){
            if (root == null) {
                return false;
            }
            if (root.data == data) {
                return true;
            }
            if (data < root.data) {
                return searchRec(root.left, data);
            } else {
                return searchRec(root.right, data);
            }
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        while (true) {
            System.out.println("enter the number elements to insert (or type 'exit' to quit)");
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("exitng the program...");
                break;
            } 

            int N = Integer.parseInt(input);
            System.out.println("enter " + N + " numbers:");

            for(int i = 0; i < N; i++) {
                int num = scanner.nextInt();
                bst.insert(num);
            }

            System.out.println("enter a number to search for: ");
            int searchNum = scanner.nextInt();

            if(bst.search(searchNum)) {
                System.out.println(searchNum + " is found is the BST");
            } else {
                System.out.println(searchNum + " is not found in the BST");
            }

        }
        scanner.close();

    }
}
