
public class BST extends BinaryTree{

	public BST()
	{
		super();
	}

	
	public char largestKey (BinaryTree t){
		if(t.emptyTree())
			return '\0';
		else {
			if( t.getRight().emptyTree()){
				return t.getRoot();
			}
			else{
				return largestKey(t.getRight());
			}
				
		}
	}
	
	public char smallestKey (BinaryTree t){
		if(t.emptyTree())
			return '\0';
		else {
			if(t.getLeft().emptyTree() ){
				return t.getRoot();
			}
			else{
				return smallestKey(t.getLeft());
			}
				
		}
	}
	
	public BinaryTree searchTree(char value,BinaryTree t){
		if(t.emptyTree())
			return null;
		else{
			if(t.getRoot()==value)
				return t;
			else{
				if(value>t.getRoot())
						return searchTree(value,t.getRight());
				else
						return searchTree(value,t.getLeft());
				
		}
	}
}	
	
	
	
	public void insertInOrder(char value, BinaryTree t){
		if(t.emptyTree())
			t.insertNode(value,0);
		else{
				if(value>t.getRoot()){
					if(t.getLeft().emptyTree() && t.getRight().emptyTree())
						t.insertNode(value,1);
					else
						 insertInOrder(value,t.getRight());
					}
					
				else{
					if(t.getLeft().emptyTree() && t.getRight().emptyTree())
						t.insertNode(value,0);
					else
						insertInOrder(value,t.getLeft());
					
					}
			}
	}
	public void deleteNode(char value,BinaryTree t){
		BinaryTree subtree,tempLeft,tempRight;
		char newParent;
		subtree=searchTree(value,t);
		if(subtree==null){
			System.out.println("Node not found");
		}else{
			if(subtree.getRoot()==value){
					if(subtree.getLeft().emptyTree() && subtree.getRight().emptyTree()){
						subtree.root=null;
						
					}
					else{
						if(subtree.getLeft().emptyTree()){
							tempLeft=subtree.getRight().getLeft().copyTree();
							tempRight=subtree.getRight().getRight().copyTree();
							subtree.root=new Node (subtree.getRight().getRight().getRoot());
							subtree.root.setLeftChild(tempLeft);
							subtree.root.setRightChild(tempRight);
						}else{
							if(subtree.getRight().emptyTree()){
								tempLeft=subtree.getLeft().getLeft().copyTree();
								tempRight=subtree.getLeft().getRight().copyTree();
								subtree.root=new Node (subtree.getRight().getLeft().getRoot());
								subtree.root.setLeftChild(tempLeft);
								subtree.root.setRightChild(tempRight);
							}else{
								newParent=smallestKey(subtree.getRight());
								tempLeft=subtree.getLeft().copyTree();
								deleteNode(newParent,subtree.getRight());
								tempRight=subtree.getRight().copyTree();
								subtree.root=new Node(newParent);
								subtree.root.setLeftChild(tempLeft);
								subtree.root.setRightChild(tempRight);
							}
						}
						
						
						
					}
			}
			
	}
		
}
}
