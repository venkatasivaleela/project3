package method;

public class Person {
	String name;
	Person()
	{
		this("Abdul kalam azad");
		this.display();
	}
	Person(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("person name is="+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person();
		

	}

}
