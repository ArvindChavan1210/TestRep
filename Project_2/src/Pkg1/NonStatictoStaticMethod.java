package Pkg1;

public class NonStatictoStaticMethod {
	public static void m1() {
		
		System.out.println("I am static method");
		
	}
	public void m2() {
		
		this.m1();
		m1();
		NonStatictoStaticMethod.m1();
		NonStatictoStaticMethod obj=new NonStatictoStaticMethod();
		obj.m1();
		
	}
public static void main(String[] args) {
	
	NonStatictoStaticMethod obj=new NonStatictoStaticMethod();
	obj.m2();
	System.out.println(obj);
}
}
/* in this non static method calling static method
using
-this keyword
direct call
using ref. variable
using class */