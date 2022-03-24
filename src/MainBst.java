

/*
 * UC1-Ability to create a BST by adding 56 and then adding 30 & 70 
 */
public class MainBst {

	/**
	 * Main method for manipulation of BinarySearchTree(BST)
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {

		/**
		 * Procedure:-
		 * 
		 * 1. Creating object of MainBst class 
		 * 2. Adding the sub-nodes of Binary Tree 
		 * 3. Printing the elements
		 * 
		 */

		/*
		 * 1. Creating object of the BinaryTree class
		 */
		BinaryTree bst = new BinaryTree();

		/*
		 * initial node root will pointing to null here root is empty
		 */
		Node root = null;

		/*
		 * 2.inserting the values in the root by calling the insert method
		 */
		root = bst.insert(root, 86);

		root = bst.insert(root, 60);

		root = bst.insert(root, 20);

		/*
		 * 3.here printing the root values
		 */
		bst.print(root);

	}
}
