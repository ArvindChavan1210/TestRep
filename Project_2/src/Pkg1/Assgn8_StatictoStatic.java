package Pkg1;

public class Assgn8_StatictoStatic {
	static int a=1;
	
	public void increment() {
		a=a+1;
	
	}
	public static void main(String[] args) {
		
		Assgn8_StatictoStatic obj=new Assgn8_StatictoStatic();
		obj.increment();
		System.out.println(obj);
	}

}
