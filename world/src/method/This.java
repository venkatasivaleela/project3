package method;

public class This {
	int i=100;
	static int x=9;
	void meth1()
	{
		int i=50;
		System.out.println("Instance variable:"+this.i);
		//System.out.println("static variable:"+this.x);
		System.out.println("static variable:"+This.x);
		System.out.println("local variable:"+i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This().meth1();

	}

}
