package Pkg1;

public class Constructor {
	public Constructor() {
		this(4,5,6);
		System.out.println("Default Constructor");
	}
	public Constructor(int a) {
		this();
		System.out.println("One Parametrize Constructor");
	}
	public Constructor(int b, int c) {
		this (1,2,3,4);
		System.out.println("Two Parametrize Constructor");
	}
	public Constructor(int d, int e, int f) {
		System.out.println("Three Parametrize Constructor");
	}
	public Constructor(int a1, int a2, int a3, int a4) {
		this(15);
		System.out.println("Four Parametrize Constructor");
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor(10,21);
	}
}
