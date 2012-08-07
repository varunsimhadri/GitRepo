package apr.twenty.tree;

public
class MultiplyExp extends SQLExpr {
  ExponentExp rand1;
  MultiplyExp rand2;
  String rator;
  boolean isBinaryExpr;

  public MultiplyExp()
	{}
	
  
  public MultiplyExp(ExponentExp r1)
  {
	  super();
		isBinaryExpr = false;
		rand1 = r1;
  }

  public MultiplyExp(ExponentExp r1, String op, MultiplyExp r2)
  {
	  super();
	  isBinaryExpr = true;
		rand1 = r1;
		rator = op;
		rand2 = r2;
  }
  
}
