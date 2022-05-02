package world;

public class Stringemployee {
	int empid;
	int salary;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringemployee emp1=new Stringemployee();
		Stringemployee emp2=new Stringemployee();
		Stringemployee emp3=new Stringemployee();
		emp1.init(100,20000,"Sowju");
		emp1.display();
		emp2.init(102,30000,"Pushpa");
		emp2.display();
		emp3.init(103, 40000,"Jaya");
		emp3.display();
}
	void init(int empid_temp,int salary_temp,String name_temp)
	{
		empid=empid_temp;
		salary=salary_temp;
		name=name_temp;
	}
	void display()
	{
		System.out.println("empid = "+empid);
		System.out.println("salary= "+salary);
		System.out.println("name="+name);
	}

}
