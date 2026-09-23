/*

Programmers {
  1. Mario Aguilera Piceno
}

File: main.cpp
About: BinaryTree program entry point.
Created: 09/21/2026
Updated: 09/23/2026

*/

#include <iostream>
#include "binary-tree.h"

int main() {
  // Ask user to provide values for tree:
  std::cout << "In Order (IN); Level order (LO); " << std::endl;
  
  int binArray[] = {1, 2, 3};
  
  BinaryTree tree = new BinaryTree(binArray);
  
}
