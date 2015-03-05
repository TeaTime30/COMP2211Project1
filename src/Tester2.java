
public class Tester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree Test=new BST();
		
		((BST) Test).insertInOrder('8',Test);
		((BST) Test).insertInOrder('5',Test);	
		((BST) Test).insertInOrder('9',Test);
		((BST) Test).insertInOrder('3',Test);
		((BST) Test).insertInOrder('1',Test);
		((BST) Test).insertInOrder('4',Test);
		((BST) Test).insertInOrder('2',Test);
		System.out.print("Largest key: ");
		System.out.println(((BST) Test).largestKey(Test));
		System.out.print("Smallest key: ");
		System.out.println(((BST) Test).smallestKey(Test));
		System.out.print("Searching for 1 : ");
		System.out.println(((BST) Test).searchTree('1',Test));
		System.out.print("The tree inorder: ");
		System.out.println(Tester1.inOrder(Test));
		
		((BST) Test).deleteNode('4',Test);
		System.out.print("Tree after deleting 4: ");
		System.out.println(Tester1.inOrder(Test));

	}

}
