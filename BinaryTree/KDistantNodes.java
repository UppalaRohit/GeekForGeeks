package BinaryTree;

public class KDistantNodes {
	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getDefaultBinaryTree();
		printKDistantNodes(tree.root,2);
	}

	private static void printKDistantNodes(Node node, int i) {
		if(node == null) {
			return;
		}
		if(i==0) {
			System.out.println(node.key);
		}else {
			printKDistantNodes(node.left, i-1);
			printKDistantNodes(node.right, i-1);
		}
	}
}


/* Constructed binary tree is 
    	1 
      /   \ 
     2     3 
    /  \    
   4    5  
   
    level 2  o/p: 4 5
    level 1  o/p: 2 3
    
*/
