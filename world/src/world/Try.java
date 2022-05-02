package world;

public class Try 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a[]=new int[5];
		a[8]=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Any number cannot be divide by zero");
			System.out.println("It gives an exception"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("We cannot store any value out of an array size declared");
			System.out.println("It gives an exception"+e);
		}
	}
}
	


