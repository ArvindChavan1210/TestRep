package Pkg1;

public class Student { 
	int age=25;
	int roll_no=18; 
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
		
	}
	
	public static void main(String[] args) {
	Student stu=new Student(); 
	stu.display1(); 
	stu.display2(); 
	System.out.println(stu.age);
	System.out.println(stu.roll_no);
	
}
}
	


