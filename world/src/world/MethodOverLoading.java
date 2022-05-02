package world;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading obj=new MethodOverLoading();
		obj.add(10,20);
		obj.add(10.24,20.50);
		obj.add(30.42f,50.2);
		obj.add(20,30,40);
		

	}
	void add(int x,int y)
	{
		int sum=x+y;
		System.out.println("sum of two numbers"+sum);
	}
	void add(double x,double y)
	{
		double sum=x+y;
		System.out.println("sum of two numbers"+sum);
	}
	void add(float x,float y)
	{
		float sum=x+y;
		System.out.println("sum of two numbers"+sum);
	}
	void add(int x,int y,int z)
	{
		int sum=x=y+z;
		System.out.println("sum of three numbers"+sum);
	}

}
