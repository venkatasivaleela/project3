package world;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int number=4;//it is the number to calculate factorial
		for(i=1;i<number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+number+"is:"+fact);

	}

}
