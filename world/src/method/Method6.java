package method;

public class Method6 {
	int meth1(int a,int b)
	{
		System.out.println(10);
		int x=new Method6().meth2(2,2);
		System.out.println(10+x);
		return a-(a+b);
		
	}
	int meth2(int a,int b)
	{
		System.out.println(45);
		return a*b;
	}
	void meth3(int a,int b)
	{
		System.out.println(75);
		System.out.println(new Method6().meth1(10, 20)+10);
		System.out.println(a/8);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Method6().meth3(10,2);

	}

}
