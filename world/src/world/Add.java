package world;
public class Add {
	int meth1(int a,int b)
	{
		int Add=a+b;
		System.out.println("defination of method"+ Add);
		return 100;
	}
	void meth2()
	{
		System.out.println("it is given numbers");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj=new Add();
		obj.meth1(4,8);
		obj.meth2();
	
	}

}
