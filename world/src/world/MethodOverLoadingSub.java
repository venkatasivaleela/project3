package world;

public class MethodOverLoadingSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingSub obj=new MethodOverLoadingSub();
		obj.sub(30,20);
		obj.sub(70.40,60.50);
		obj.sub(40.6f,10.24f);
		obj.sub(80,60,30);

	}
	void sub(int x,int y)
	{
		int sub=x-y;
		System.out.println("sub of two numbers"+sub);
	}
	void sub(double x,double y)
	{
		double sub=x-y;
		System.out.println("sub of two numbers"+sub);
	}
	void sub(float x,float y)
	{
		float sub=x-y;
		System.out.println("sub of two numbers"+sub);
	}
	void sub(int x,int y,int z)
	{
		int sub=x-y-z;
		System.out.println("sub of three numbers"+sub);
	}

}
