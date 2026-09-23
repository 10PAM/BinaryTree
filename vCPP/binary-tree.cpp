/*

Programmers {
  1. Mario Aguilera Piceno
}

File: binary-tree.cpp
About: Creates binary tree from BinaryTree header once the constructor is called.
Created: 09/21/2026
Updated: 09/23/2026

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
