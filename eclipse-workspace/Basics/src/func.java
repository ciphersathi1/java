
public class func {
	
	//with arg without return type
	static void add(double d,double e) //declaration
	{
		double c;    
		c=d+e;
		System.out.println("Addition is :"+c);
	}
	
	//with arg with return
	static int sub(int a,int b) {
		int c=a-b;
		return c;	
	}
	
	//without arg with return
	static int mul() {
		int a,b,c;
		a=5;
		b=5;
		c=a*b;
		return c;
	}
	
	//without arg without return
	static void div() {
		int a,b,c;
		a=5;
		b=5;
		c=a/b;
		System.out.println("Division is :"+c);
	}
	
	public static void main(String[] args) {
        //call
		//with arg without return type
		add(10.5,20);
		
		//without arg with return
		int d=sub(10,20);
		System.out.println("Subtraction is :"+d);
		
		//without arg with return
		int e=mul();
		System.out.println("Multiplication is :"+e);
		
		//without arg without return
		div();
		
	}
}
