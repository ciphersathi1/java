public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1000;
		int b=200;
		int c=30;
		if(a>b) //true -> a False -> b
		{ 
			if(a>c) { // true -> a false-> c
				System.out.println("A is Big");
			}
			else { 
				System.out.println("C is Big");
			}
		}
		else if(b>c) { //true ->b False -> c
			System.out.println("B is Big");
		}
		else //default 
		{
			System.out.println("C is Big");
		}
	}
}
