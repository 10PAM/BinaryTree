/*

Programmers {
  1. Mario Aguilera Piceno
}

AI Utilized {
  1. Gemini - Used to help guide the intial in-order recursive helper methods.
}

File: binary-tree.h
About: Handles BinaryTree class once created from main.cpp.
Created: 09/21/2026
Updated: 09/22/2026

*/

class BinaryTree {
  public:
    BinaryTree(int[] &array) {};
    ~BinaryTree() {};
    BinaryTree left;
    BinaryTree right;

    // Helper Method: Recurses array to create left and right trees.
    BinaryTree createInOrder();
}
