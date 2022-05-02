package method;

public class Method7 {
	String meth1(int a,int b)
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value=new Method7().meth5();
		System.out.println(value);
		return "java";//meth4()
	}
	int meth2(int a)
	{
		System.out.println(75);
		int b=5;
		System.out.println(b-a);
		return (5*5)-b;
	}
	void meth3()
	{
		System.out.println("start");
		System.out.println(new Method7().meth4());
		System.out.println(40);
	}
	String meth4()
	{
		System.out.println("today is saturday");
		return new Method7().meth1(4,8);
	}
	int meth5()
	{

		Method7 obj=new Method7();		
		System.out.println(99);
	    return obj.meth2(5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method7 aobj=new Method7();
		aobj.meth3();

	}

}
