package method;

public class Method5 {
	int meth1(int a,String s)
	{
		System.out.println("meth1() called");
		System.out.println(s);
		return a+99;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method5 aobj=new Method5();
		int x=aobj.meth1(1,"java is awesome");
		System.out.println("x value:"+x);
		//System.out.println(aobj.meth1(1,"java is awesome"));

	}

}
