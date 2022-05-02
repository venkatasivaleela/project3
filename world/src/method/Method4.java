package method;

public class Method4 {
	void meth1(int a)
	{
		System.out.println("meth1() called:"+a);
		new Method4().meth2(2,2,10);
	}
	void meth2(int a,int b,int c)
	{
		System.out.println("meth2() called:"+(a*b)+c+50);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Method4().meth1(500);

	}

}
