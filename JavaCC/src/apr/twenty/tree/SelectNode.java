package apr.twenty.tree;

public class SelectNode extends SQLQueryNode {
	public SQLPredicate p;
	public SQLQueryNode childNode;

	public SQLQueryNode getChildNode() {
		return childNode;
	}

	public void setChildNode(SQLQueryNode childNode) {
		this.childNode = childNode;
	}

	public SelectNode() {

	}

	public SelectNode(SQLPredicate p) {
		this.p = p;
	}

	public void print() {
		System.out.println("SelectNode");
		childNode.print();
	}
}
