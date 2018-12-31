package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;

	BinaryTree() {
		root = null;
	}

	BinaryTree(int key) {
		root = new Node(key);
	}

	public int size() {
		return size(root);
	}

	public void printInOrder() {
		printInOrder(root);
	}

	public void printPreOrder() {
		printPreOrder(root);
	}

	public void printPostOrder() {
		printPostOrder(root);
	}

	public int height() {
		return height(root);
	}

	public void printLevelOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);
	}

	public void printLevelOrder_Queue() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.key + " ");

			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}
	}

	public int findMax() {
		return findMax(root);
	}

	public int findMin() {
		return findMin(root);
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(1);

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("PreOrder : ");
		tree.printPreOrder();
		System.out.println("\nPostOrder : ");
		tree.printPostOrder();
		System.out.println("\nInOrder : ");
		tree.printInOrder();
		System.out.println("\nLevelOrder : ");
		tree.printLevelOrder();
		System.out.println("\nLevelOrder_Queue : ");
		tree.printLevelOrder_Queue();
		System.out.println("\nSize :" + tree.size());
		System.out.println("Height :" + tree.height());
		System.out.println("Max :" + tree.findMax());
		System.out.println("Min :" + tree.findMin());

	}

	private void printPreOrder(Node root) {
		if (root != null) {
			System.out.print(root.key + " ");
			printPreOrder(root.left);
			printPreOrder(root.right);
		}
	}

	private void printPostOrder(Node root) {
		if (root != null) {
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.print(root.key + " ");
		}
	}

	private void printInOrder(Node root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.print(root.key + " ");
			printInOrder(root.right);
		}
	}

	private int size(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + size(root.left) + size(root.right);
	}

	private int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Integer.max(height(root.left), height(root.right));
		}
	}

	private void printGivenLevel(Node root, int lvl) {
		if (root == null) {
			return;
		}
		if (lvl == 1) {
			System.out.print(root.key + " ");
		} else {
			printGivenLevel(root.left, lvl - 1);
			printGivenLevel(root.right, lvl - 1);
		}
	}

	private int findMax(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int rootVal = root.key;
		int leftVal = findMax(root.left);
		int rightVal = findMax(root.right);

		if (rootVal < leftVal) {
			rootVal = leftVal;
		}
		if (rootVal < rightVal) {
			return rightVal;
		} else {
			return rootVal;
		}
	}

	private int findMin(Node root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}

		int rootVal = root.key;
		int leftVal = findMin(root.left);
		int rightVal = findMin(root.right);

		if (rootVal > leftVal) {
			rootVal = leftVal;
		}
		if (rootVal > rightVal) {
			return rightVal;
		} else {
			return rootVal;
		}
	}

}
