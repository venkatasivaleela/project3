package world;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions obj=new Functions();
		double total=obj.add(10,20);//function calling
		System.out.println("sum of two numbers are " +total);
		total=obj.add(90,70.60);
		System.out.println("sum of two numbers are "+total);
	}
//this function is used to add two numbers and return result
double add(int x, double y)
{
	double sum=x+y;
	return(sum);
		

	}

}
