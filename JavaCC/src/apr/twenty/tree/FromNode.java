package apr.twenty.tree;

import java.util.LinkedList;
public class FromNode extends SQLQueryNode{
	public LinkedList<QueryTableExp> expList; 
	
	public FromNode() {
		expList = new LinkedList<QueryTableExp>();
	}
	
	public void add(QueryTableExp e){
		expList.add(e);
	}
	
	public void print(){
		System.out.println("FromNode");
	}
}
