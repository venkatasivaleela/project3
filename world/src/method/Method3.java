package method;

public class Method3 {
	void meth1()
	{
		Method3 obj1=new Method3();
		obj1.meth5();
		int a=10;
		System.out.println(10);
		System.out.println(54+a);
		
	}
	void meth2()
	{
		int a=20;
		System.out.println(78-a);
	}
	void meth6()
	{
		int a=30;
		Method3 obj1=new Method3();
		System.out.println(89+1);
		obj1.meth1();
		System.out.println(10);
	}
	void meth4()
	{
		int a=10;
		System.out.println(89);
		System.out.println(85);
		System.out.println(44);
	}
	void meth5()
	{
		System.out.println(77);
		Method3 obj1=new Method3();
		obj1.meth2();
		System.out.println(99);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Method3 aobj=new Method3();
		aobj.meth6();
		System.out.println("end");

	}

}
