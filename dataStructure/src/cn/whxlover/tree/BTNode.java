package cn.whxlover.tree;

public class BTNode {

	//�ڵ�ֵ
	Object e;
	//��ڵ�
	BTNode left;
	//�ҽڵ�
	BTNode right;
	//�ղι��캯��
	public BTNode() {
		left = right =null;
	}
	//�вι��캯��
	public BTNode(Object e,BTNode left ,BTNode right) {
		this.e = e;
		this.left=left;
		this.right=right;
	}
}
