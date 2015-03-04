
public class BST extends BinaryTree{

	public BST()
	{
		super();
	}

	
	public String largestKey (BinaryTree t){
		if(t.emptyTree())
			return "null";
		else {
			if( t.getRight().emptyTree()){
				return t.getRoot()+"";
			}
			else{
				return largestKey(t.getRight());
			}
				
		}
	}
	
	public String smallestKey (BinaryTree t){
		if(t.emptyTree())
			return "null";
		else {
			if(t.getLeft().emptyTree() ){
				return t.getRoot()+"";
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
				if(!t.getLeft().emptyTree()){
					if(value==t.getLeft().getRoot()){
						return t;
					}else{
						if(!t.getRight().emptyTree()){
							if(value==t.getRight().getRoot())
								return t;
							else{
								if(value>t.getRoot())
									return searchTree(value,t.getRight());
								else
									return searchTree(value,t.getLeft());
							}
						}else
							return searchTree(value,t.getLeft());
					}
				}else{
					if(!t.getRight().emptyTree()){
						if(value==t.getRight().getRoot())
							return t;
						else
							return searchTree(value,t.getRight());
					}
					else
						return null;
				
				}
					
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
		BinaryTree subtree;
		subtree=((BST) t).searchTree(value,t);
		if(subtree==null){
			System.out.println("Node not found");
		}else{
			if(subtree.getLeft().emptyTree() && subtree.getRight().emptyTree()){
				
			}
		}
	}
}
