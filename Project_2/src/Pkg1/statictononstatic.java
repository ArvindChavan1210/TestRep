package Pkg1;

public class statictononstatic {
	
	public void m1() {
		System.out.println("This is static calling non static");
	}
	public static void m2() {
	
		 statictononstatic obj=new  statictononstatic();
			obj.m1();
			
	}
public static void main(String[] args) {
	 m2();
	 
}
}
