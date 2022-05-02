package practice;

public class String1 {
	void meth1()
	{
		System.out.println("Implementing of string class methods");
		String s1="Java";
		String s2=new String("Java");
		String s3="Java";
		String s4=new String("Java");
		System.out.println("concat():"+s3.concat("is awesome"));
		System.out.println("s3");
		//strings which are created by using string class are immutable
		System.out.println("length():"+s1.length());
		System.out.println("length():"+"Kavitha".length());
		System.out.println("length():"+s4.concat("Kavitha is awesome"));
		System.out.println("length():"+"kavitha have many friends in this institute");
		System.out.println("length():"+s3.length());
		System.out.println("concat():"+s2.concat("prasuna"));
		System.out.println("length():"+s4.length());
		System.out.println("length():"+s1.concat("is a good course").length());
		System.out.println("length():"+"yasmeen".length());
		System.out.println("-------------------");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s2==s4);
		System.out.println(s1==s3);
		System.out.println("******************");
		System.out.println(s1=="Java");
		System.out.println(s2=="Java");
		System.out.println(s3=="Java");
		System.out.println(s4=="Java");
		System.out.println("=========================");
		System.out.println(s1.equals(s2));//true
		System.out.println(s3.equals(s4));//true
		System.out.println(s3.equals(s1));//true
		System.out.println(s2.equals(s4));//true
		System.out.println(s1.equals("JAVA"));//false
		System.out.println(s4.equals("JAVA"));//false
		System.out.println("equalsIgnorecase():"+s3.equals("JAVA"));
		
	}
	void meth2()
	{
		String s1="Python";
		String s2="Java is Awesome";
		String s3="Prasuna";
		String s4="Kavitha is good girl";
		//charAt method
		System.out.println("charAt():"+s1.charAt(3));
		System.out.println("charAt():"+s2.charAt(8));
		System.out.println("charAt():"+s3.charAt(6));
		System.out.println("charAt():"+s4.charAt(11));
		//startwith method
		System.out.println("startsWith():"+s2.startsWith("Java"));
		System.out.println("startsWith():"+s2.startsWith("JAVA"));
		System.out.println("startsWith():"+s1.startsWith("Java"));
		System.out.println("startsWith():"+s1.startsWith("program"));
		System.out.println("startsWith():"+s3.startsWith("program"));
		System.out.println("startsWith():"+s4.startsWith("Kavitha"));
		System.out.println("startsWith():"+s4.startsWith("KAVITHA"));
		System.out.println("------------------------");
		//lower case method
		System.out.println("toLowerCase():"+s1.toLowerCase());
		System.out.println("s1:"+s1);
		//upper case method
		System.out.println("toUpperCase():"+s4.toUpperCase());
		System.out.println("s4:"+s4);
	}
	//Implementing substring method
	void meth3()
	{
		String s1="Database";
		String s2="Python is a language";
		String s3="CoreJava";
		System.out.println("substring():"+s1.substring(0));//Database
		System.out.println("substring():"+s2.substring(4));//on is a language
		System.out.println("substring():"+s3.substring(2));//reJava
		System.out.println("substring():"+s1.substring(3,7));//abas
		System.out.println("substring():"+s2.substring(4,8));//on i
		System.out.println("substring():"+s3.substring(2,7));//reJav
		//replace method
		System.out.println("replace():"+s2.replace('a', 'A'));
		System.out.println("replace():"+s1.replace('D', 'd'));
		System.out.println("replace():"+s1.replace('a', 'A'));
		//trim method
		String s4=" Hello world ";
		System.out.println("trim():"+s4.trim());//Hello world
		
	}
	
	
	
	

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String1 aobj=new String1();
		//aobj.meth1();
		//aobj.meth2();
		aobj.meth3();
		
		

	}

}
