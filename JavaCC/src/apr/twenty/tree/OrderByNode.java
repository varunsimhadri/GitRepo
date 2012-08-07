package apr.twenty.tree;

import java.util.LinkedList;

public class OrderByNode extends SQLQueryNode {
	public SQLQueryNode childNode;
	public LinkedList<OrderByExpression> expList;

	public OrderByNode() {
		expList = new LinkedList<OrderByExpression>();
		childNode = new SQLQueryNode();
	}

	public void addChild(SQLQueryNode n) {
		childNode = n;
	}

	public void addExp(OrderByExpression e) {
		expList.add(e);
	}

	public void print() {
		System.out.println("OrderByNode");
		childNode.print();
	}

	public SQLQueryNode getChildNode() {
		return childNode;
	}

	public void setChildNode(SQLQueryNode childNode) {
		this.childNode = childNode;
	}
}
