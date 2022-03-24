/*
 * UC2-Ability to create the binary tree shown in the figure
 * they given a figure in UC2
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
		 * 4. to create the binary tree shown in the figure
		 * 4. Check if all are added with using size method in Binary Tree and print it
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
		root = bst.insert(root, 56);
		root = bst.insert(root, 30);
		root = bst.insert(root, 70);
		root = bst.insert(root, 22);
		root = bst.insert(root, 40);
		root = bst.insert(root, 60);
		root = bst.insert(root, 95);
		root = bst.insert(root, 11);
		root = bst.insert(root, 65);
		root = bst.insert(root, 3);
		root = bst.insert(root, 6);
		root = bst.insert(root, 63);
		root = bst.insert(root, 67);

		/*
		 * 3.here printing the root values
		 */
		bst.print(root);

	}
}