package apr.twenty.tree;

import java.util.LinkedList;
import java.util.ListIterator;

public class SelWithoutOrderNode extends SQLQueryNode {
	public LinkedList<SQLQueryNode> nodeList;
	public LinkedList<Integer> typeList;

	/*
	 * type: 1 - union 2 - union all 3 - intersect 4 - minus
	 */

	public SelWithoutOrderNode() {
		nodeList = new LinkedList<SQLQueryNode>();
		typeList = new LinkedList<Integer>();

	}

	public void add(SQLQueryNode n) {
		nodeList.add(n);
	}

	public void add(int t, SQLQueryNode n) {
		nodeList.add(n);
		typeList.add(t);
	}

	public void print() {
		System.out.println("SelectWithoutOrderNode");
		ListIterator<SQLQueryNode> itr = nodeList.listIterator();

		while (itr.hasNext()) {
			itr.next().print();
		}
	}
}
