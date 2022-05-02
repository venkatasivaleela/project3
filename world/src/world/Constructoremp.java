package world;

public class Constructoremp {
	String name;
	int empid;
	String group;
	static String companyname="TCS";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoremp emp1=new Constructoremp("SRINU",100,"TESTER","TCS");
		Constructoremp emp2=new Constructoremp("GANI",200,"DEVELOPER","TCS");
		emp1.display();
		emp2.display();

	}
	Constructoremp(String name_temp,int empid_temp,String group_temp,String companyname_temp)
	{
		name=name_temp;
	    empid=empid_temp;
	    group=group_temp;
	    name=name_temp;
}
	Constructoremp()
	{
		System.out.println("Default constructor is executed");
	}
	void display()
	{
		System.out.println("employee name is "+name);
		System.out.println("employee empid is"+empid);
		System.out.println("employee group is "+group);
		System.out.println("employee companyname is"+companyname);
		
	}
	

}
