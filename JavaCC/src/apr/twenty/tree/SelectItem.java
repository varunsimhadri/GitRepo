package apr.twenty.tree;

public class SelectItem {
	public SimpleExp exp;
	public String alias;

	public SelectItem() {

	}

	public void add(SimpleExp e, String alias) {
		exp = e;
		this.alias = alias;
	}

	public void add(SimpleExp e) {
		exp = e;
	}

	public void print() {

	}
}
