package world;

abstract class Abc {
	abstract void method1();
	  void method2()
	  {
		System.out.println("Defination of method 2");
	}
}
	public class Abstract extends Abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract obj=new Abstract();
		obj.method1();
		obj.method2();

	}
	void method1()
	{
		System.out.println("Defination of method1");
	}

}

