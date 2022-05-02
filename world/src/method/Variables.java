package method;

public class Variables {
	int a=10;
	static int b=20;
	int x;
	static int y;
	void meth1()
	{
		int a=30;
		int b=500;
		String data=" Java is awesome";
		System.out.println("Instance variable a:"+a);
		System.out.println("Instance variable a:"+new Variables().a);
		System.out.println("----------");
		System.out.println("static variable b:"+b);
		System.out.println("static variable b:"+new Variables().b);
		System.out.println("static variable b:"+ Variables.b);
		System.out.println("-----------");
		System.out.println("local variable c:"+a);
	}
	void meth2()
	{
		int z;
		System.out.println("--------meth2()--------");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		//System.out.println("z:"+z);
		System.out.println("--------------");
		System.out.println("Instance variable a:"+a);
		System.out.println("Static variable b:"+b);
		//System.out.println("local variable data:"+data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables aobj=new Variables();
		aobj.meth1();
		aobj.meth2();

	}

}
