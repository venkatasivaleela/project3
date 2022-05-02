package method;

public class Methodreturn {
	void meth1()
	{
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
	}
	int meth2()
	{
		System.out.println("meth2() called");
		return 500;
	}
	//System.out.println("Java is awesome");//C.E
	int meth3(int a)
	{
		System.out.println("meth3() called");
		if(a<=10)
		{
			System.out.println("if block is executed");
			return a+100;
		}
		else
		{
			System.out.println("else block is executed");
			return a-100;
		}
	}
	void meth4()
	{
		System.out.println("Java is awesome!!!");
		return;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Methodreturn aobj=new Methodreturn();
		aobj.meth1();
		System.out.println("=>"+aobj.meth2());
		System.out.println("meth3() is returning:"+aobj.meth3(5));
		System.out.println("end");

	}

		
	

}
