package BinaryTree;

public class CountLeafNode {

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getDefaultBinaryTree();
		System.out.println("No of Leaf Nodes: " + printLeafNodes(tree.root));
	}

	private static int printLeafNodes(Node node) {
		if(node == null) {
			return 0;
		}else if(node.left == null && node.right == null) {
			return 1;
		}else {
			return (printLeafNodes(node.left)+printLeafNodes(node.right));
		}
		
	}
	
}
