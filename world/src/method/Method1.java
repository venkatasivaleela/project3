package method;

public class Method1 {
	public void meth1()
	{
		int a=10;
		System.out.println(10);
		System.out.println(10+a);
		
	}
	public void meth2()
	{
		int a=20;
		System.out.println(50-a);
		Method1 obj=new Method1();
		obj.meth1();
		System.out.println("java is awesome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Method1 aobj=new Method1();
		aobj.meth2();
		System.out.println("end");

	}

}
