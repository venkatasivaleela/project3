package world;

public class Studentinit {
	int rolno;
	String name;
	String group;
	static String collegename;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentinit std1=new Studentinit();
		Studentinit.initStaticData();
		std1.init(1,"GANI","MPC");
		std1.display();
		Studentinit std2=new Studentinit();
		std2.init(2,"SRINU","BIPC");
		std2.display();
}
	static void initStaticData()
	{
		collegename="CBIT";
	}
	void init(int rolno_temp,String name_temp,String group_temp)
	{
		rolno=rolno_temp;
		name=name_temp;
		group=group_temp;

	}
	static
	{
		System.out.println("Static block code");
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Rolno="+rolno);
		System.out.println("Group="+group);
		System.out.println("Collegename="+collegename);
	}

}
