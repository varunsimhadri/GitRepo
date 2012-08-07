package apr.twenty.tree;

public class ExponentExp extends SQLExpr {
	UnaryExp rand1;
	ExponentExp rand2;
	String rator = "**";
	boolean isBinaryExpr;

	public ExponentExp()
	{}
	
	public ExponentExp(UnaryExp r1)
  {
		super();
		isBinaryExpr = false;
		rand1 = r1;
  }

  public ExponentExp(UnaryExp r1, ExponentExp r2)
  {
	  	super();
		isBinaryExpr = true;
		rand1 = r1;
		rand2 = r2;
  }
	
}
