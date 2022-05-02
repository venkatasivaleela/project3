package method;
import java.util.Scanner;
import java.io.InputStream;

public class ClassAscanner {
	ClassAscanner sc=new  ClassAscanner(System.in);
	void sum()
	{
		System.out.println("please enter 1st number");
		int a=sc.nextInt();
		System.out.println("a value:"+a);
		System.out.println("please enter 2nd number");
		int b=sc.nextInt();
		System.out.println("b value:"+b);
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	int meth1()
	{
		System.out.println("meth1() called");
		System.out.println("please enter the number to return");
		return sc.nextInt();
	}
	void meth2()
	{
		System.out.println("meth2() called");
		System.out.println("please enter 1st number");
		int first=sc.nextInt();
		System.out.println("please enter 2nd number");
		int second=sc.nextInt();
		for(System.out.println("printing all the numbers between"+first+"&"+second);first<=second;first++)
		{
			System.out.println(first);
		}
	}
	void meth3()
	{
		System.out.println("what is your name???");
		String data=sc.next();
		System.out.println("user has entered"+data);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAscanner aobj=new ClassAscanner();
		/* aobj.sum();
		 System.out.println("------------");
		 System.out.println("=>"+aobj.meth1());
		 System.out.println("-------------");
		 aobj.meth2();
		 System.out.println("--------------");
		 */
		aobj.meth3();

	}

}
