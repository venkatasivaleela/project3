package method;

public class This1 {
	void meth1()
	{
		System.out.println("meth1() called");
	}
	void meth2()
	{
		this.meth1();
		System.out.println("meth2() called");
	}
	void meth3()
	{
		this.meth2();
		System.out.println("meth3() called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This1().meth3();
		//this.meth3();

	}

}
