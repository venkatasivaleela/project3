package world;


	interface interface1
	{
		int x=10;
		void method1();
	}
	interface interface2
	{
		int y=90;
		void method2();
	}
	public class Interface implements interface1,interface2{
		interface interface3
		{
			int z=50;
			void meth3();
		}
		public void method1()
		{
			System.out.println("Defination of method");
		}
		public void method2()
		{
			System.out.println("Method2 defination");
		}
		public void method3()
		{
			System.out.println("Method3 defination");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj=new Interface();
		obj.method1();
		obj.method2();
		obj.method3();
}
	
}
