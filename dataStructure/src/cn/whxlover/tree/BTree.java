package cn.whxlover.tree;

public interface BTree {

	//����һ�Ŷ�����
	public void Create();
	//����һ�Ŷ�����
	public void Desatroy();
	//�ж϶������Ƿ�Ϊ��
	public boolean IsEmpty();
	//��ȥ���нڵ㣬��Ϊ�ն�����
	public void clear();
	//���������ǿգ���xΪ����ֵ��������true�����򷵻�false
	public boolean Root(Object e);
	//����һ�Ŷ�����������ֵΪx����left��rightΪ��������
	public void MakeTree(Object x,BinaryTree left,BinaryTree Right);
	//��ֶ�����Ϊ�����֣�xΪ����ֵ��left��rightΪԭ��������������
	public void BreakTree(Object x,BinaryTree left,BinaryTree Right);
	//�������
	public void PreOrder();
	//�������
	public void InOrder();
	//�������
	public void PostOrder();
}
