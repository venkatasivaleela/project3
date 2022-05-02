package method;

public class Methodsum {
	public void meth1()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("addition:"+c);
	}
	public void meth2()
	{
		int d=50;
		int e=30;
		int f=d-e;
		System.out.println("substraction:"+f);
	}
	public void meth3()
	{
		int i=12;
		int j=10;
		int k=i*j;
		System.out.println("multiplication:"+k);
	}
	public void meth4()
	{
		int l=60;
		int m=30;
		int n=l/m;
		System.out.println("division:"+n);
	}
	public void meth5()
	{
		int p=40;
		int q=20;
		int r=p%q;
		System.out.println("modulus:"+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodsum aobj=new Methodsum();
		aobj.meth1();
		aobj.meth2();
		aobj.meth3();
		aobj.meth4();
		aobj.meth5();

	}

}
