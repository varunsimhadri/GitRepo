package apr.twenty.tree;

import java.util.LinkedList;

public class ApplyMerge extends Apply {
	LinkedList<String> bindVarList;

	public ApplyMerge(String Type, String var) {
		super(Type);
		bindVarList = new LinkedList<String>();
		bindVarList.add(var);
	}

}
