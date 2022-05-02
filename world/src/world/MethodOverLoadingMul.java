package world;

public class MethodOverLoadingMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingMul obj=new MethodOverLoadingMul();
		obj.mul(20,10);
		obj.mul(20.2,30.4);
		obj.mul(40.4f,60.2f);
		obj.mul(20,90,10);
		

	}
	void mul(int x,int y)
	{
		int mul=x*y;
		System.out.println("mul of two numbers"+mul);
	}
	void mul(double x,double y)
	{
		double mul=x*y;
		System.out.println("mul of two numbers"+mul);
	}
	void mul(float x,float y)
	{
		float mul=x*y;
		System.out.println("mul of two numbers"+mul);
	}
	void mul(int x,int y,int z)
	{
		int mul=x*y*z;
		System.out.println("mul of three numbers"+mul);
	}

}
