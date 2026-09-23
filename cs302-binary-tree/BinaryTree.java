/*
* Author: Mario Aguilera Piceno
* File: BinaryTree.java
* About: Logic of in-order recursive binary tree.
* Date: 05/29/2026
* Last Modified: 06/09/2026.
*/

/**
* Final Project  
*                                                   
* Completion time: 19 hours                                      
*                                                              
* Honor Code: “I pledge that I have neither given nor received help from * anyone other than the instructor or the TAs for all program components * included here.”
*
* I used the following AI tool: Gemini.
*/

/**
 * Declare package and import required classes.
 */
package com.mycompany.finalpackage;
import java.util.*;

/**
 * BinaryTree Class: in-order recursive binary tree.
 * 
 * @param <T> the type of BinaryTree data object.
 */
public class BinaryTree<T> {
    
    /**
     * Binary Tree Attributes
     */
    private T data;
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    /**
     * Recursively checks binary tree for null nodes. Complete is true if root has no further connections.
     * Uses Queue to keep track of nodes.
     * 
     * @return Returns true if tree is naked or all nodes are filled from left to right; Returns false otherwise.
     */
    public boolean isComplete() {
        if (this == null || (this.left == null && this.right == null)) {
            return true;
        }

        Queue<BinaryTree<T>> fifo = new LinkedList<>();
        fifo.offer(this);
        
        boolean lastNull = false;
        while (!fifo.isEmpty()) {
            BinaryTree<T> tree = fifo.poll();
            if (!(tree == null) && !(tree.data == null)) {
                if (lastNull) {
                    return true;
                } else {
                    fifo.offer(tree.left);
                    fifo.offer(tree.right);
                }
            } else {
                lastNull = true;
            }
        }
        return false;
    }
    
    /**
     * Check if binary tree contains a specified value.
     * 
     * @param value The target value being searched for.
     * @return Returns true if the target value is found in tree; Returns false otherwise.
     */
    public boolean contains(T value) {
        return containsRecurse(this, value);
    }
    
    /**
     * Recursively checks if tree contains a specified value from left to right.
     * 
     * @param tree The tree being searched for the value.
     * @param value The value being searched for in the tree.
     * @return Returns true if value is found in tree; Returns false otherwise.
     */
    public boolean containsRecurse(BinaryTree tree, T value) {
        if (tree == null) {
            return false;
        }
        
        if (tree.data == value) {
            return true;
        }

        return containsRecurse(tree.left, value) || containsRecurse(tree.right, value);
    }
    
    /**
     * Checks if binary tree is balanced using recursive helper method.
     * 
     * @return Returns true if height is not negative 1 (balanced); Returns false otherwise (unbalanced).
     */
    public boolean isBalanced() {
        return isBalancedRecurse(this);
    }
    
    /**
     * Determines if the tree is balanced using height.
     * Tree is not balanced if height is negative 1.
     * 
     * @param tree the tree being checked for balance.
     * 
     * @return Returns true if height is not negative 1 (balanced); Returns false otherwise (unbalanced).
     */
    public boolean isBalancedRecurse(BinaryTree<T> tree) {
        if (tree == null) {
            return true;
        }

        int leftHeight = heightRecurse(tree.left);
        int rightHeight = heightRecurse(tree.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalancedRecurse(tree.left) && isBalancedRecurse(tree.right);
    }
    
    /**
     * Gets height of binary tree.
     * 
     * @return Returns -1 if tree has is empty. Returns recursed height otherwise.
     */
    public int height() {
         return heightRecurse(this);
    }
    
    /**
     * Recurses through tree to until last node is reached, incrementing height on the go.
     * 
     * @param tree the tree being checked recursively for height.
     * @return Returns -1 if tree has is empty. Returns recursed height otherwise.
     */
    public int heightRecurse(BinaryTree<T> tree) {
         if (tree == null) {
             return 0;
         }
         return Math.max(heightRecurse(tree.left), heightRecurse(tree.right)) + 1;
    }
    
    /**
     * toString() method that constructs a string line representing full binary tree data.
     * 
     * @return Returns in-order string data representation of the binary tree; Height; Completeness; and Balanced if tree is balanced.
     */
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        inOrderString(sb);
        String orderedData = sb.toString().trim();
        
        if (this == null) {
            return "null";
        }
        
        String complete = "False";
        if (isComplete()) {
            complete = "True";
        }
        
        String balanced = "False";
        if (isBalanced()) {
            balanced = "True";
        }
        
        if (orderedData.equals("null")) {
            return "null/invalid tree.";
        }
        
        return "{" + orderedData + "}. Height: " + height() + ". Complete: " + complete + ". Balanced: " + balanced + ".";
    }
    
    /**
     * Method that recursively constructs in-order data string and
     * returns it from left to right.
     * 
     * @return In-order string data representation of the binary tree.
     */
    private void inOrderString(StringBuilder sb) {
        if (this.left != null) {
            this.left.inOrderString(sb);
        }
        sb.append(this.data).append(" ");
        if (this.right != null) {
            this.right.inOrderString(sb);
        }
    }
    
    /**
     * Equals method. Checks if:
     * 1. binary tree is itself
     * 2. binary tree's are null
     * 3. other object is a different object type
     * 4. one tree is empty and other is not
     * 5. if the values are different
     * 6. if any of the binary trees' values are different
     * 
     * @param other The object being compared.
     * @return Returns true if both BinaryTrees are equals; Returns false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        
        if (this == other || (this == null && other == null)) {
            return true;
        }
        
        if (this == null || (other == null || getClass() != other.getClass())) {
            return false;
        }
        
        BinaryTree tree = (BinaryTree) other;
        
        if (this.data != tree.data) {
            return false;
        }

        return Objects.equals(this.left, tree.left) && Objects.equals(this.right, tree.right);
    }
    
    /**
     * Hashcode for overriden equals method.
     * 
     * @return Returns hashed data.
     */
    @Override
    public int hashCode() {
        return Objects.hash(data, left, right);
    }
    
    public void createTree(Object[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        constructTree(arr, 0);
    }

    
    private BinaryTree constructTree(Object[] arr, int i) {
        if (i >= arr.length) {
            return null;
        }

        BinaryTree root = new BinaryTree(arr[i]);

        root.left = constructTree(arr, 2 * i + 1);
        root.right = constructTree(arr, 2 * i + 2);

        return root;
    }
    
    public BinaryTree(T value) {
        this.data = value;
    }
    
    /**
     * Recursively constructs a binary tree with specified values from array.
     * 
     * Checks for invalid array format before recursively creating tree.
     * 
     * Recursively passes less and less values to constructor to create a
     * binary tree with left and right half of values.
     * 
     * @param values The array of data being used to construct binary tree.
     */
    public BinaryTree(T[] values) {
        if (values == null || values.length == 0) {
            return;
        }
        
        if (values[0] == null && values.length > 1) {
            for (int i = 1; i < values.length; i++) {
                if (values[i] != null) {
                    return;
                }
            }
        }

        for (int i = 1; i < values.length; i++) {
            if (values[i] != null) {
                int parent = (i - 1) / 2;
                if (values[parent] == null) {
                    return;
                }
            }
        }
        
        createTree(values);
        
        /*
        int midPoint = values.length / 2;
        this.data = values[midPoint];
        
        int leftSize = midPoint;
        int rightSize = values.length - midPoint - 1;

        if (leftSize > 0) {
            Object[] leftHalf = new Object[(values.length/2)];
            for (int i = 0; i < midPoint; ++i) {
                leftHalf[i] = values[i];
            }
            this.left = new BinaryTree(leftHalf);
        }
        if (rightSize > 0) {
            Object[] rightHalf = new Object[values.length - midPoint - 1];
            for (int i = 0; i < rightHalf.length; ++i) {
                rightHalf[i] = values[midPoint + 1 + i];
            }
            this.right = new BinaryTree(rightHalf);
        }*/
    }
}
