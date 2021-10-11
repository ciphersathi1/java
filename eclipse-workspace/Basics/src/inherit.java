class arith1{
	void mul() {
		int a,b,c;
		a=5;
		b=5;
		c=a*b;
		System.out.println("Multiplcation is :"+c);
	}
	void div() {
		int a,b,c;
		a=5;
		b=5;
		c=a/b;
		System.out.println("Division is :"+c);
	}
}
class arith2 extends arith1 {
	void add() {
		int a,b,c;
		a=5;
		b=5;
		c=a+b;
		System.out.println("Additions is :"+c);
	}
}
class arith3 extends arith1 
{ 
	void sub() {
		int a,b,c;
		a=5;
		b=5;
		c=a-b;
		System.out.println("Sub is :"+c);
	}
}
public class inherit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arith3 a=new arith3();
		//a.add();
		a.sub();
		a.mul();
		a.div();
	}
}
