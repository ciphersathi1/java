class employee{
	private String name;
	private int age;
	private float sal;
	public employee(String name,int age,float sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	double salary(int attendance) {
		float c;
		c=this.sal*attendance;
		System.out.println(this.name+" salary is : "+c);
		return c;
	}
	void incentive(double e) {
		double d;
		d=e*0.2;
		System.out.println(this.name+" Incentive is : "+d);
	}
}
public class emp {
	public static void main(String[] args) {
		employee e1=new employee("sathish",24,300);
		employee e2=new employee("celciya",24,5000);
		employee e3=new employee("marutha muthu",24,700);
		employee e4=new employee("karthika",24,900);
		employee e5=new employee("srini",24,250);
		employee e6=new employee("mythili",24,450);
		double e=e1.salary(26);
		e1.incentive(e);
	}
}
