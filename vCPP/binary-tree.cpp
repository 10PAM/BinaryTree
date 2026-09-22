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
