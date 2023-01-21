package Pkg1;

public class Non_Static_Method {
	public void disp() {
		System.out.println("Hello world");
			}
public static void main(String[] args) {
	Non_Static_Method obj=new Non_Static_Method();
	obj.disp();
}
}
