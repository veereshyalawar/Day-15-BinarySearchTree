/*
 * UC1-Ability to create a BST by adding 56 and then adding 30 & 70
 * -------------------------------------------------------------
 * UC2-Ability to create the binary tree shown in the figure
 * -------------------------------------------------------
 * UC3-Ability to search 63 in the Binary Tree
 * ------------------------------------------
 */
public class MainBst {

	/**
	 * Main method for manipulation of BinarySearchTree(BST)
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		
		/**
		 * ----------
		 * Procedure:-
		 * ----------
		 * 1. Creating object of MainBst class 
		 * 2. Adding the sub-nodes of Binary Tree 
		 * 3. Printing the elements
		 * 4. to create the binary tree shown in the figure
		 * 4. Check if all are added with using size method in Binary Tree and print it
		 * 5.Implement Search method and recursively search left or right nodes to find 63
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

		/**
		 * if condition is true our particular node is present the it prints true or
		 * false type because this is boolean method
		 */
		System.out.println(bst.nodePresent(root, 11));

		/**
		 * if else statement is used if condition is true then print 63 is present is
		 * binary tree if condition false then print 63 is not present in binary tree.
		 */

		if (root != null)
			System.out.println("\nElement 11 is present in the binary tree");
		else
			System.out.println("\nElement 11 is not present in the binary tree");
	}
}