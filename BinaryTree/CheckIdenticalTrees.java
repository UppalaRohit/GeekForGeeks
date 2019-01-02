package BinaryTree;

public class CheckIdenticalTrees {

	public static void main(String[] args) {
		BinaryTree tree1 = BinaryTree.getDefaultBinaryTree();
		
		BinaryTree tree2 = new BinaryTree(1);

		tree2.root.left = new Node(2);
		tree2.root.right = new Node(3);
		tree2.root.left.left = new Node(4);
		tree2.root.left.right = new Node(5);
		
		System.out.println("The 2 trees are " + (checkIfIdentical(tree1.root,tree2.root)?"identical":"not Identical"));
		
	}

	private static boolean checkIfIdentical(Node root, Node root2) {
		
		if(root == null && root2 == null ) {
			return true;
		}
		if(root != null && root2 != null) {
			return (root.key == root2.key) 
					&& (checkIfIdentical(root.left, root2.left)) 
					&& (checkIfIdentical(root.right, root2.right));
		}
		return false;
	}
}
