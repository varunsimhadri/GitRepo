package apr.twenty.custom;

import java.util.LinkedList;
import java.util.ListIterator;

public class FunctionBody {
	LinkedList<PLSQLStmt> stmtList;

	public LinkedList<PLSQLStmt> getStmtList() {
		return stmtList;
	}

	public void setStmtList(LinkedList<PLSQLStmt> stmtList) {
		this.stmtList = stmtList;
	}

	public FunctionBody(LinkedList<PLSQLStmt> myStmtList) {
		super();
		this.stmtList = myStmtList;
	}

	public void addStmt(PLSQLStmt stmt) {
		stmtList.add(stmt);
	}

	public void PrintElements() {
		System.out.println("PLSQLStatements:");
		ListIterator<PLSQLStmt> iter = stmtList.listIterator();
		while (iter.hasNext()) {
			PLSQLStmt printStmt = iter.next();
			printStmt.PrintElements();
		}
	}
}
