package world;

public class Constructor {
	String name;
	int rolno;
	String group;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor std1=new Constructor("Gani",1,"MPC");
		std1.display();
		Constructor obj=new Constructor();
	}
	Constructor(String name_temp,int rolno_temp,String group_temp)
	{
		name=name_temp;
		rolno=rolno_temp;
		group=group_temp;
	}
	Constructor()
	{
		System.out.println("Default constructor is executed");
	}
	void display()
	{
		System.out.println("Student name is"+name);
		System.out.println("Student rolno is"+rolno);
		System.out.println("Student group is"+group);
	}
	

}
