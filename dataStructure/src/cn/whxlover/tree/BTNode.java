package cn.whxlover.tree;

public class BTNode {

	//节点值
	Object e;
	//左节点
	BTNode left;
	//右节点
	BTNode right;
	//空参构造函数
	public BTNode() {
		left = right =null;
	}
	//有参构造函数
	public BTNode(Object e,BTNode left ,BTNode right) {
		this.e = e;
		this.left=left;
		this.right=right;
	}
}
