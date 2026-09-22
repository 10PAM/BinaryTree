#include <iostream>
#include "binary-tree.h"

int main() {
  // Ask user to provide values for tree:
  std::cout << "In Order (IN); Level order (LO); " << std::endl;
  
  int binArray[] = {1, 2, 3};
  
  BinaryTree tree = new BinaryTree(binArray);
  
}
