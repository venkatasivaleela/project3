package world;

 class ClassB {
	void meth1()
	{
		System.out.println("method1 is executed");
	}
	void meth2()
	{
		System.out.println("method2 is executed");
	}
}
	 class ClassA extends ClassB
	{
		void meth3()
		{
			System.out.println("method3 is executed");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj=new ClassA();
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
	}

	

