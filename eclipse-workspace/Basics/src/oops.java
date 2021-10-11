class demo{
	public int x,y; //global variable
	public demo() 
	{
		System.out.println("Welcome to my class");
	}
	void add(int a,int b) {
		int c;
		c=this.x+b;
		System.out.println(c);
	}
}
public class oops {
	public static void main(String[] args) {
		//demo  d=new demo(10,20);
		demo  f=new demo();
		//d.print();
		f.add(50,30);
	}
}
