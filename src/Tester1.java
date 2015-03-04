
/***
 * 
 * @author : Jillian Johnson(620069957), Tereica Anderson(620070595)
 * @version : 1.0 (Date:24/02/2015)
 *
 */
public class Tester1 {

	/***
	 * 
	 * @param t (a binary tree)
	 * @return the number of 'A' characters found in the Tree
	 */
	public static int countA(BinaryTree t){
		if(t.emptyTree()){
			return 0;
		}
		else{
		
			if(t.getRoot()=='A'){
				return countA(t.getLeft())+ countA(t.getRight())+1;
			}
			else{
				return countA(t.getLeft())+countA(t.getRight());
			}
		}
	}
	
	/***
	 * 
	 * @param t (a binary tree)
	 * @return the number of leaves in the tree
	 */
	public static int countLeaves(BinaryTree t){
		if(t.emptyTree()){
			return 0;
		}
		else{
			if(t.getLeft().emptyTree() && t.getRight().emptyTree()){
				return 1;
			}
			else{
				return countLeaves(t.getLeft())+countLeaves(t.getRight());
			}
		}
	}
	
	/***
	 * 
	 * @param t (a binary tree)
	 * @return the postOrder view of the tree (Left Right Parent)
	 */
	public static String postOrder(BinaryTree t){
		if(t.emptyTree()){
			return "";
		}
		else{
			if(t.getLeft().emptyTree() && t.getRight().emptyTree()){
				return t.getRoot()+"";
			}
			else{
				return postOrder(t.getLeft())+postOrder(t.getRight())+ t.getRoot()+"";
			}
		}
	}
	
	/***
	 * 
	 * @param t (a binary tree)
	 * @return the inOrder view of the tree (Left Parent Right)
	 */
	public static String inOrder(BinaryTree t){
		if(t.emptyTree()){
			return "";
		}
		else{
			if(t.getLeft().emptyTree() && t.getRight().emptyTree()){
				return t.getRoot()+"";
			}
			else{
				return inOrder(t.getLeft())+ t.getRoot()+inOrder(t.getRight())+"";
			}
		}
	}
	
	//The main
	public static void main(String args[]){
		System.out.println("Testing Tester1\n");	
		BinaryTree Test=new BinaryTree();
		//Constructing tree
		Test.insertNode('+',0);
		Test.insertNode('/', 0);
		Test.insertNode('*', 1);
		Test.getLeft().insertNode('*', 0);
		Test.getLeft().insertNode('-',1);
		Test.getLeft().getLeft().insertNode('2',0);
		Test.getLeft().getLeft().insertNode('3',1);
		Test.getLeft().getRight().insertNode('2',0);
		Test.getLeft().getRight().insertNode('1',1);
		Test.getRight().insertNode('5', 0);
		Test.getRight().insertNode('-',1);
		Test.getRight().getRight().insertNode('4',0);
		Test.getRight().getRight().insertNode('1',1);
		//Outputting Results of the functions
		System.out.print("countA: ");
		System.out.println(countA(Test));
		System.out.print("countLeaves: ");
		System.out.println(countLeaves(Test));
		System.out.print("postOrder: ");
		System.out.println(postOrder(Test));
		System.out.print("inOrder: ");
		System.out.println(inOrder(Test));
		
		
	}
}
