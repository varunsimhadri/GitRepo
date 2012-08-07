package apr.twenty.tree;

import java.util.LinkedList;
import java.util.Map;
import apr.twenty.custom.*;

import apr.twenty.custom.Parameter;

@SuppressWarnings("unused")
public class TupleConstructor extends SQLQueryNode {
	Map<String, ScalarNode> myMap;

	public TupleConstructor() {
		super();
		myMap = null;
	}

	public void addToMap(String var, ScalarNode n) {
		myMap.put(var, n);
	}

	public void addList(LinkedList<Parameter> strList) {
		for (int i = 0; i < strList.size(); i++) {
			myMap.put(strList.get(i).getParamName(), null);
		}
	}

	public void addVarList(LinkedList<String> strList) {
		for (int i = 0; i < strList.size(); i++) {
			myMap.put(strList.get(i), null);
		}
	}
}
