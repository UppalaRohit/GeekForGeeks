package BinaryTree;

public class FindLevelOfNode {
	public static void main(String[] args) {
	
		BinaryTree tree = new BinaryTree(); 
		   
        /* Constructing tree given in the above figure */
        tree.root = new Node(3); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(4);
		
		for (int x = 1; x <= 5; x++)  
        { 
            int level = getLevel(tree, x); 
            if (level != 0) 
                System.out.println("Level of " + x + " is "
                        + getLevel(tree, x)); 
            else
                System.out.println(x + " is not present in tree"); 
        } 
	}

	private static int getLevel(BinaryTree tree, int x) {
		return getLevel(tree.root, x, 1);
	}

	private static int getLevel(Node root, int x, int l) {

		if(root == null) {
			return 0;
		}
		if(root.key == x) {
			return l;
		}
		int tempLvl = getLevel(root.left, x,l+1);
		if(tempLvl != 0){
			return tempLvl;
		}
		tempLvl = getLevel(root.right, x, l+1);
		return tempLvl;
	}
}
