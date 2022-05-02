package method;

public class This2 {
	This2 meth1()
	{
	  System.out.println("meth1() called");
	  return this;
	}
	 This2 meth2()
	{
		System.out.println("meth2() called");
		return this;
	}
	void meth3()
	{
		System.out.println("meth3() called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This2().meth1().meth2().meth3();

	}

}
