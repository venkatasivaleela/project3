package method;

public class This3 {
	void smile()
	{
		System.out.println("smile is the best medicine in life");
		this.sad();
	}
	void sad()
	{
		System.out.println("sadness is also important in life ");
	}
	This3()
	{
		System.out.println("default constructor");
		this.smile();
	}
	This3(int a)
	{
		this();
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This3(100);

	}

}
