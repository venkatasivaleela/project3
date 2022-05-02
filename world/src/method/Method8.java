package method;

public class Method8 {
	void meth1()
	{
		System.out.println(10);
		System.out.println(64);
		System.out.println("end");
	}
	int meth2(int a,int b,int c)
	{
		System.out.println(a);
		Method8 bobj=new Method8();
		String s=bobj.meth5(100,"Jasva is awesome");
		System.out.println(s);
		return a-b;
		
	}
	String meth3(String s,int b,int d)
	{
		System.out.println(b+d);
		return s;
	}
	int meth4(int c,int k)
	{
		System.out.println(k);
		Method8 bobj=new Method8();
		int result=bobj.meth2(50, 50, 50);
		System.out.println(result);
		return k+10;
	}
	String meth5(int a,String L)
	{
		System.out.println(a+a);
		Method8 bobj=new Method8();
		String s=bobj.meth3("Hiii", 15, 10);
		System.out.println(s);
		return L;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method8 bobj=new Method8();
		System.out.println("START");
		int result=bobj.meth4(20,10);
		System.out.println(result);
		bobj.meth1();

	}

}
