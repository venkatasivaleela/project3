package assignments;

public class Grade
{
	Grade( int marks)
	{

	
	if(marks<25)
	
		System.out.println("F");
		else if( marks<45)
		System.out.println("E");
		else if(marks<50)
		System.out.println("D");
        else if(marks<60)
		System.out.println("C");
        else if(marks<80)
		System.out.println("B");
		else if(marks>80)
		System.out.println("A");
		else if(marks>100)
        System.out.println("none");	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grade(45);

	}

}
