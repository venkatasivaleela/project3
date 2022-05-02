package world;

import java.util.Scanner;

public class Scanner1 {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Scanner1().empdetails();

	}
	void empdetails()
	{
		System.out.println("please enter the Employee name");
		String a=sc.nextLine();
		System.out.println("Employee Name:"+a);
		sc.nextLine();
		
	    System.out.println("please enter the Employee ID");
	    String b=sc.nextLine();
	    System.out.println("Employee ID:"+b);
	    sc.nextLine();
	
	    System.out.println("please enter the Employee Salary");
	    String c=sc.nextLine();
	    System.out.println("Employee Salary:"+c);
	    sc.nextLine();
	
	    System.out.println("please enter the Employee Address");
	    String d=sc.nextLine();
	    System.out.println("Employee Address:"+d);
	    sc.nextLine();
	
	   System.out.println("please enter the Employee Department");
	   String e=sc.nextLine();
	   System.out.println("Employee Department:"+e);
	   sc.nextLine();

}
}
