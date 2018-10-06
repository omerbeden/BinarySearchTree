package bst;

public class Test {
	
	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.insert(30); 
        tree.insert(10); 
        tree.insert(32); 
        tree.insert(43); 
        tree.insert(45); 
        tree.insert(7); 
        tree.insert(15);
        
        tree.inOrder();
        System.out.println("----------");
        tree.search(54);
        
       tree.maxValue();
       tree.minValue();
       
      
        
	}

}
