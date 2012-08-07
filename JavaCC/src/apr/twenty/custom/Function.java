package apr.twenty.custom;

import apr.twenty.tree.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Function {
	String Identifier;
	LinkedList<Parameter> paramList;
	String returnType;
	FunctionBody myBody;
	ScalarNode returnExpr;

	public Function(String identifier, LinkedList<Parameter> paramList,
			String returnType, FunctionBody myBody, ScalarNode returnExpr) {
		super();
		Identifier = identifier;
		this.paramList = paramList;
		this.returnType = returnType;
		this.myBody = myBody;
		this.returnExpr = returnExpr;
	}

	public String getIdentifier() {
		return Identifier;
	}

	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}

	public LinkedList<Parameter> getParamList() {
		return paramList;
	}

	public void setParamList(LinkedList<Parameter> paramList) {
		this.paramList = paramList;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public FunctionBody getMyBody() {
		return myBody;
	}

	public void setMyBody(FunctionBody myBody) {
		this.myBody = myBody;
	}

	public ScalarNode getReturnExpr() {
		return returnExpr;
	}

	public void setReturnExpr(ScalarNode returnExpr) {
		this.returnExpr = returnExpr;
	}

	public void PrintElements() {
		System.out.print("Function: " + Identifier + "takes parameters: ");
		ListIterator<Parameter> iter = paramList.listIterator();
		while (iter.hasNext()) {
			Parameter param = iter.next();
			System.out.print(" " + param.paramName);
		}
		System.out.println("  returns: " + returnType);
		myBody.PrintElements();

		// System.out.println("and finally returns: "+ returnExpr.timepass);
	}
}
