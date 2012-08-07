package apr.twenty.tree;

import java.util.LinkedList;

import apr.twenty.custom.PLSQLStmt;

public class DeclareStmt extends PLSQLStmt {
	public LinkedList<String> varList;
	public String dataType;

	public DeclareStmt(String type, LinkedList<String> varList, String dataType) {
		super(type);
		this.varList = varList;
		this.dataType = dataType;
	}

	public void PrintElements() {
		System.out.print("Declare Statement: " + dataType + "  ");
		System.out.println(varList);
	}
}
