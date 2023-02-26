package Pkg1;

public class StatictoStaticMethod {
	
	public static void m1() {
		System.out.println("This is Static calling static");
	}
	public static void m2() {
		m1();  // direct call using this keyword
		StatictoStaticMethod.m1();                  // Call using class
		StatictoStaticMethod obj=new StatictoStaticMethod();   
		obj.m1();    // call using ref variable
				
	}
public static void main(String[] args) {
	StatictoStaticMethod obj1= new StatictoStaticMethod();
	System.out.println("Output is");
	obj1.m2();
			
}
}