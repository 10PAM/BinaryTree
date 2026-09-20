BinaryTree::BinaryTree(int& arrayRepresentation) {
  this.left = new BinaryTree(arrayRepresentation);
  this.right = new BinaryTree(arrayRepresentation);
}

~BinaryTree::BinaryTree() {
  
}
