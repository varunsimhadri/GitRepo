package apr.twenty.tree;

//import parser.SelectItem;
import java.util.LinkedList;

public class ProjectNode extends SQLQueryNode {
	public int type;
	/**
	 * type: 0 - nothing 1 - all 2 - distinct 3 - unique
	 */

	public SQLQueryNode childNode;
	public LinkedList<SelectItem> itemList;
	public boolean projectStar;

	public ProjectNode() {
		itemList = new LinkedList<SelectItem>();
	}

	public ProjectNode(boolean projStar) {
		this.projectStar = projStar;
	}

	public SQLQueryNode getChildNode() {
		return childNode;
	}

	public void add(SelectItem si) {
		itemList.add(si);
	}

	public void setChildNode(SQLQueryNode childNode) {
		this.childNode = childNode;
	}

	public void setType(int t) {
		type = t;
	}

	public int getType() {
		return type;
	}

	public void print() {
		System.out.println("ProjectNode");
		childNode.print();
	}
}
