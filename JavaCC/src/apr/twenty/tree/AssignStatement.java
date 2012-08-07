package apr.twenty.tree;

import apr.twenty.custom.PLSQLStmt;

public class AssignStatement extends PLSQLStmt {
	public String lhs;
	public ScalarNode rhs;

	public AssignStatement(String type, String lhs, ScalarNode rhs) {
		super(type);
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public void PrintElements() {
		System.out.println("Assignment: " + lhs + " = ");
		if (rhs.Type == 2) {
			rhs.myQNode.print();
		}
	}
}
