import abst;
class ask{
	void add(double a,double b) {
		double c;
		c=a+b;
		System.out.println("output is :"+c);		
	}
}
class ask2 extends ask{
		void add(int a,int b,int c) {
			int d;
			d=a+b+c;
			System.out.println("Ans is :"+d);		
		}		
}
public class ast {
	public static void main(String[] args) {
		ask2 a=new ask2();
		ask b=new ask();
		b.add(20, 30);
		a.add(10,20,30);
		arith f=new arith();
		f.ad();
	}
}
