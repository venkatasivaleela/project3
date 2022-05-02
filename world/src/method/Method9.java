package method;

public class Method9 {
	public void meth1()
	{
		System.out.println("meth1() called");
	}
	public static void meth2()
	{
		System.out.println("static meth2() called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method9 aobj=new Method9();
		aobj.meth1();
		Method9.meth2();
		//Method9.meth1();

	}

}
