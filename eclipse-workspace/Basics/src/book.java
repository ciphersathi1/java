interface A{  
void a();  
void b();  
void c();  
void d();  
}  
class B implements A{  
public void c(){System.out.println("I am c");}  
}  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}   
public class book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d(); 
	}
}