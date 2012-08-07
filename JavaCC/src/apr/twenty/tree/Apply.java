package apr.twenty.tree;

public class Apply extends SQLQueryNode {
	String Type;
	SQLQueryNode left;
	SQLQueryNode right;

	public Apply(String Type) {
		super();
		this.Type = Type;
		this.left = null;
		this.right = null;
	}
	
	public void setType(String type){
		this.Type = type;
	}
	public String getType(String type){
		return this.Type;
	}
}
