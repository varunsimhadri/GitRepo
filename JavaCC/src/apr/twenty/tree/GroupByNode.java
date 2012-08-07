package apr.twenty.tree;

import java.util.LinkedList;

public class GroupByNode extends SQLQueryNode{
	LinkedList<String> grpExpList;
	SQLPredicate havingPred;
	public SQLQueryNode childNode;
	
	public GroupByNode() {
		grpExpList = new LinkedList<String>();
	}
	
	public void setGrpExpList(LinkedList<String> grpExpList){
		this.grpExpList = grpExpList;
	}
	
	public void setHavingPred(SQLPredicate havingPred){
		this.havingPred = havingPred;
	}
	
	public SQLQueryNode getChildNode() {
		return childNode;
	}

	public void setChildNode(SQLQueryNode childNode) {
		this.childNode = childNode;
	}

	public void print(){
		System.out.println("GroupByNode");
		childNode.print();
		
	}
}
