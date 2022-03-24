/*
 * creating the class Node
 * determining the left or right node and the data be the type of integer
 */
class Node {
	int data;
	Node left;
	Node right;

}

public class BinaryTree {

	/**
	 * creating method insert to inserting the node to the BST
	 * 
	 * @param root- root will be the type of left, right and center
	 * @param val- represents value
	 * @return to create NewNode
	 */

	/*
	 * 1. checking conditions by taking if else statement check first condition- if
	 * root is null then it will return to createnewNode and insert the new value
	 */

	public Node insert(Node root, int val) {
		if (root == null) {
			return craeteNewNode(val);
		}
		/*
		 * 2. condition second if value is lesser then root data value then it will
		 * inserting a root value to the left side
		 */
		if (val < root.data) {
			root.left = insert(root.left, val);
		}

		/*
		 * 3. condition third if value is greater then root data value then it will
		 * inserting a root value to the right side
		 */
		else if (val > root.data) {

			root.right = insert(root.right, val);
		}
		return root;

	}

	/**
	 * create a method name as createNewNode and passing parameter k in int type
	 * 
	 * @param k-data to be assigned to k parameter
	 * @return
	 */
	public Node craeteNewNode(int k) {
		Node bst = new Node();
		bst.data = k;
		/*
		 * both left and right root data's are null
		 */
		bst.left = null;
		bst.right = null;
		return bst;
	}

	/**
	 * creating method print to print the data values
	 * 
	 * @param root- parameter is root
	 */
	public void print(Node root) {
		if (root == null) {
			return;
		}
		print(root.left);
		System.out.println(root.data);
		print(root.right);

	}

	/**
	 * here we create nodePresent method to check whether our node is present or not
	 * by checking this we follow here boolean method this is parameterized
	 * method.root and value are passed boolean type method so this method give o/p
	 * is true or false type.
	 * 
	 * @param root
	 * @param val
	 * @return
	 */
	public boolean nodePresent(Node root, int val) {
		/*
		 * checking condition if root is empty then false
		 */
		if (root == null) {
			return false;
		}
		Boolean isPresent = false;

		/*
		 * if boolean result will be false type below statements are satisfied here in
		 * while loop taking condition like root is not empty if this is satisfied this
		 * will entering to the if else statement here comparing if value is lesser than
		 * root data value then it is pointing to left side or enter to else if part
		 * here else if value is greater then root data value it is pointing to the
		 * right side or else both will not happen it simply printing as true
		 * 
		 */
		while (root != null) {
			if (val < root.data) {
				root = root.left;
			} else if (val > root.data) {
				root = root.right;
			} else {
				isPresent = true;
				break;
			}

		}
		return isPresent;
	}
}