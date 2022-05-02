package world;

public class Stringstudent {
	int rolno;
	String name;
	String group;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringstudent std1=new Stringstudent();
		Stringstudent std2=new Stringstudent();
		std1.init(1,"Yasmeen","mpc");
		std1.display();
		std2.init(2,"Kavitha","bipc");
		std2.display();

	}
	void init(int rolno_temp,String name_temp,String group_temp)
	{
		rolno=rolno_temp;
		name=name_temp;
		group=group_temp;
	}
	void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Rolno = "+rolno);
		System.out.println("Group = "+group);
	}

}
