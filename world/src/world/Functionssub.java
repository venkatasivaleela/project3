package world;

public class Functionssub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionssub obj=new Functionssub();
		double total=obj.sub(50,20.90);
		System.out.println("sub of two numbers are"+total);
		total=obj.sub(40,10.20);
		System.out.println("sub of two numbers are"+total);
		
}
	//this function is used to sub of two numbers and below is the defination of function
double sub(int x,double y)
{
	double sub=x-y;
	return(sub);
}
}
