package world;

public class Functionsmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionsmul obj=new Functionsmul();
		double total=obj.mul(10,20.90);
		System.out.println("Mul of two numbers are"+total);
		total=obj.mul(30,20.30);
		System.out.println("Mul of two numbers are"+total);
}
	//this function is used to mul two numbers and below is the defination of function
	double mul(int x,double y)
	{
		double mul=x*y;
		return(mul);
	}

}
