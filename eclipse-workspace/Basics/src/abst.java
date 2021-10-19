class arith{
	protected void ad() {
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("second class output is :"+c);
	}
	public void add() {
		int a,b,c;
		a=100;
		b=200;
		c=a+b;
		System.out.println(c);
	}
}
public class abst {
	public static void main(String[] args) {
		arith a=new arith();
		a.add();
		a.ad();
	}
}