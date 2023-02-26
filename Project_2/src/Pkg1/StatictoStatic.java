package Pkg1;

public class StatictoStatic {
	// Static variable must be assigned inside the class
	//..i.e. as global variable then and then only we can call
	//that variable using class name
	
	static int abc=1;
	public static void main(String[] args) {
		StatictoStatic.abc=abc+1; // here output will be two
		// if we call one more time then output will be 2+1
		StatictoStatic.abc=abc+1;
		System.out.println("Output="+abc);
		
	}
	
}
/* when static keyword is used the memory is assigned to class
hence whenever there is increment or decrement the value will be pick
from class */
/* initial value of abc=1
after first call =value = 1+1
after second call value=2+1 thus final output will be 3*/