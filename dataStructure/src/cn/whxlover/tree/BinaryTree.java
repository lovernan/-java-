package cn.whxlover.tree;

public class BinaryTree implements BTree {

	BTNode root;
	public BinaryTree() {
		root =null;
	}
	
	@Override
	public void Create() {
		// TODO Auto-generated method stub
		root = null;
		
	}
	@Override
	public void Desatroy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		if(root==null) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean Root(Object e) {
		// TODO Auto-generated method stub
		if(IsEmpty()) {
			return false;
		}else {
			System.out.println(e);
			root.e = e;
			return true;
		}
	}
	@Override
	public void MakeTree(Object x, BinaryTree left, BinaryTree Right) {
		// TODO Auto-generated method stub
		root = new BTNode(x,left.root,Right.root);
		//System.out.println(left.root.e+"  "+Right.root.e);
		left.root=null;
		Right.root=null;
		
	}
	@Override
	public void BreakTree(Object x, BinaryTree left, BinaryTree Right) {
		// TODO Auto-generated method stub
		x = root.e;
		left.root = root.left;
		Right.root = root.right;
		root = null;
	}
	@Override
	//�������--�ȷ��ʸ��ڵ㣬����������������������������
	public void PreOrder() {
		// TODO Auto-generated method stub
		if(root!=null) {
			PreOrderMethod(root);			
		}else {
			System.out.println("��");
		}
		
	}
	public void PreOrderMethod(BTNode x) {
		if(root!=null) {
			System.out.println(x.e);
			if(x.left!=null) {			
				PreOrderMethod(x.left);
			}
			if(x.right!=null) {
				PreOrderMethod(x.right);			
			}
		}else {
			System.out.println("����");
		}
	}
	@Override
	//�������---������������������ʸ��ڵ㣬�������������
	public void InOrder() {
		// TODO Auto-generated method stub
		if(root!=null) {
			InOrderMethod(root);			
		}else {
			System.out.println("��");
		}
	}
	public void InOrderMethod(BTNode x) {
		if(x!=null) {
			if(x.left!=null) {
				InOrderMethod(x.left);				
			}
			System.out.println(x.e);
			if(x.right!=null) {
				InOrderMethod(x.right);
			}
			
		}else {
			System.out.println("����/");
		}
	}
	@Override
	//����������������ȷ������������ڷ����������������ʸ��ڵ�
	public void PostOrder() {
		// TODO Auto-generated method stub
		if(root!=null) {
			PostOrderMethod(root);
		}else {
			System.out.println("��");
		}
		
	}
	public void PostOrderMethod(BTNode x) {
		if(x.left!=null) {
			PostOrderMethod(x.left);
		}
		if(x.right!=null) {
			PostOrderMethod(x.right);
		}
		System.out.println(x.e);
	}
	
	
}
