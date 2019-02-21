package cn.whxlover.tree;

public interface BTree {

	//创建一颗二叉树
	public void Create();
	//撤销一颗二叉树
	public void Desatroy();
	//判断二叉树是否为空
	public boolean IsEmpty();
	//移去所有节点，成为空二叉树
	public void clear();
	//若二叉树非空，则x为根的值，并返回true，否则返回false
	public boolean Root(Object e);
	//构造一颗二叉树，根的值为x，以left和right为左右子树
	public void MakeTree(Object x,BinaryTree left,BinaryTree Right);
	//拆分二叉树为三部分，x为根的值，left和right为原子树的左右子树
	public void BreakTree(Object x,BinaryTree left,BinaryTree Right);
	//先序遍历
	public void PreOrder();
	//中序遍历
	public void InOrder();
	//后序遍历
	public void PostOrder();
}
