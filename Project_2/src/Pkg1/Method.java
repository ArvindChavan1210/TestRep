package Pkg1;

public class Method {
	public void m() {
		System.out.println("Default Method");
	}
	public void m1() {
		System.out.println("One Parametrize Method");
	}
	public void m2() {
		System.out.println("Two Parametrize Method");
	}
	public void m3() {
		System.out.println("Three Parametrize Method");
	}
	public void m4() {
		System.out.println("Four Parametrize Method");
		this.m();
		this.m1();
		this.m2();
		this.m3();
			}
	public static void main(String[] args) {
		System.out.println("Method based this \nstatement output is as follows");
		Method obj=new Method();
		obj.m4();
	}
	
	



}
