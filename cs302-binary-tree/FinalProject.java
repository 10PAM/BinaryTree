/*
* Author: Mario Aguilera Piceno
* File: FinalProject.java
* About: Program that 
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
 * Package declaration and some imports
 */
package com.mycompany.finalpackage;

/**
 *Driver class for Final Project.
 * 
 */
public class FinalProject {
    
    /**
     * Main (entry) method.
     * @param args Required parameter.
     */
    public static void main(String[] args) {
        new FinalProject().run();
    }
    
    /**
     * Run method: Runs logic of program.
     */
    public void run() {
        
        System.out.println("Mario Aguilera Piceno | CS 301 | Professor Andonie | Final Project (Binary Tree):\n");
        Object[] values = {1, 2, 3, 4, 5, 6, 2, 1, 2};
        BinaryTree tree = new BinaryTree(values);
        System.out.println("Tree 1: " + tree);
        
        Object[] values2 = {1, 2, 3, 4, 5, 6, 2, 1, 2};
        BinaryTree tree2 = new BinaryTree(values2);
        System.out.println("Tree 2: " + tree2);
        
        Object[] values3 = {1, 2, 3, 4, 5, 6, 2, 1, 2, 7, 2};
        BinaryTree tree3 = new BinaryTree(values3);
        System.out.println("Tree 3: " + tree3 + "");
        
        Object[] values4 = {1};
        BinaryTree tree4 = new BinaryTree(values4);
        System.out.println("Tree 4: " + tree4 + "");
        
        Object[] values5 = {};
        BinaryTree tree5 = new BinaryTree(values5);
        System.out.println("Tree 5: " + tree5);
        
        Object[] values6 = {1, 2, 3, null, 5};
        BinaryTree tree6 = new BinaryTree(values6);
        System.out.println("Tree 6: " + tree6 + "\n");
        
        System.out.println("Tree 1 == Tree 2?: " + tree.equals(tree2));
        System.out.println("Tree 2 == Tree 3?: " + tree2.equals(tree3));
        System.out.println("Tree 1 == Tree 3?: " + tree.equals(tree3));
        
        System.out.println("\nTree 1 Contains 1?: " + tree.contains(1));
        System.out.println("Tree 1 Contains 99?: " + tree.contains(99));
        
    }
     
}
