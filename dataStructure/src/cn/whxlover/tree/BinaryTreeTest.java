package cn.whxlover.tree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		BinaryTree left = new BinaryTree();
		BinaryTree right = new BinaryTree();
		BinaryTree space1 = new BinaryTree();
		BinaryTree space2 = new BinaryTree();
		BinaryTree space3 = new BinaryTree();
		BinaryTree space4 = new BinaryTree();
		left.MakeTree("3", space1, space2);
		//System.out.println(left.root.e);
		right.MakeTree("44", space3, space4);
		bt.MakeTree("s", left, right);
		space1.MakeTree("hh", bt, space2);
		space2.MakeTree("77", space3, space4);
		space3.MakeTree("99", space2, space1);
		//System.out.println(bt.root.e+"  "+bt.root.left.e+"     "+bt.root.right.e);
		System.out.println("前序遍历");
		space3.PreOrder();
		System.out.println("中序遍历");
		space3.InOrder();
		System.out.println("后序遍历");
		space3.PostOrder();
	}
}
