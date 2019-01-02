package BinaryTree;

public class PrintLeftMostNodes {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(1);

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.right = new Node(4);
		tree.root.left.right.left = new Node(5);
		tree.root.left.right.left.left = new Node(6);
		tree.root.left.right.left.right = new Node(7);

		
		printLeftMostNodes(tree.root);
	}

	private static void printLeftMostNodes(Node root) {

		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null) {
			System.out.print(root.key + " ");
		}else if(root.left != null) {
			System.out.print(root.key + " ");
			printLeftMostNodes(root.left);
		}else {
			System.out.print(root.key + " ");
			printLeftMostNodes(root.right);
		}
		
	}
}
