package practice;

public class Constructor {
	int rollno;
	String1 name;
	String1 group;

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Constructor std1=new Constructor(11,"Sowju","MPC");
		std1.display();
		Constructor std2=new Constructor(22,"Pushpa","BIPC");
		std2.display();
		Constructor std3=new Constructor(33,"Reshmi","MSC");
		std3.display();
		Constructor std4=new Constructor(44,"Devi","BSC");
		std4.display();

	}
	Constructor(int rolno,String name,String group)
	{
		this.rollno=rolno;
		this.name=name;
		this.group=group;
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("group:"+group);
		System.out.println("rollno:"+rollno);
		
	}
	

}
