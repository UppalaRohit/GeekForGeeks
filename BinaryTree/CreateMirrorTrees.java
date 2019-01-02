package BinaryTree;

public class CreateMirrorTrees {

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getDefaultBinaryTree();
		
		System.out.print("InOrder before : " );
		tree.printInOrder();
		
		tree.root = mirror(tree.root);
		
		System.out.print("\nInOrder after : " );
		tree.printInOrder();
	}

	private static Node mirror(Node root) {

		if(root == null) {
			return null; 
		}
		
		Node left = mirror(root.left);
		Node right = mirror(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}
	
}
