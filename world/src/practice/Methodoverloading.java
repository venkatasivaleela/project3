package practice;

public class Methodoverloading {
	int meth1(int x,int y)
	{
		int sum=x+y;
		System.out.println("sum of two integers");
		return sum;
	}
	double meth1(double x,double y)
	{
		double sub=x-y;
		System.out.println("sub of two numbers");
		return sub;
	}
	double meth1(double x,float y)
	{
		double mul=x*y;
		System.out.println("mul of two numbers");
		return mul;
	}
	float meth1(float x,float y)
	{
		float div=x/y;
		System.out.println("div of two numbers");
		return div;
	}

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Methodoverloading aobj=new Methodoverloading();
		

	}

}
