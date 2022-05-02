package practice;

public class Studentinit {
	int rollno;
	String1 name;
	String1 group;

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Studentinit std1=new Studentinit();
		std1.init("Kavitha","MPC",10);
		std1.display();
		Studentinit std2=new Studentinit();
		std2.init("yasmeen","BSC",11);
		std2.display();
		Studentinit std3=new Studentinit();
		std3.init("Prasuna","BIPC",12);
		std3.display();
		
	}
	void init(String1 name,String1 group,int rolno)
	{
		this.name=name;
		this.group=group;
		this.rollno=rolno;
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("group:"+group);
		System.out.println("rolno:"+rollno);
	}

}
