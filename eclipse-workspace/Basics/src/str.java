
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=0;
		System.out.println(a+b);
		System.out.println(a-b);
		try {
			System.out.println(a/b);	
		}
		catch(ArithmeticException e){
			System.out.println(e);
	}
	finally {
		System.out.println(a*b);
	}
}
}