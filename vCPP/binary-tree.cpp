/*

Programmers {
  1. Mario Aguilera Piceno
}

AI Utilized {
  1. Gemini - Used to help guide the intial in-order recursive helper methods.
}

File: binary-tree.cpp
About: Creates binary tree from BinaryTree header once the constructor is called.
Created: 09/21/2026
Updated: 09/22/2026

*/

// In order recursive helper:
BinaryTree::CreateInOrder() {
  
}

// Default Constructor Call
BinaryTree::BinaryTree(int& arrayRepresentation) {
  this.left = new BinaryTree(arrayRepresentation);
  this.right = new BinaryTree(arrayRepresentation);
}

// Destructor
~BinaryTree::BinaryTree() {
}
