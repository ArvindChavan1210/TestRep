package Pkg1;
import java.util.Scanner;

public class Assgnmnet3_Method1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of x1");
		int x1=sc.nextInt();
		System.out.println("Enter Value of  x2");
		int x2=sc.nextInt();
		System.out.println("Enter Value of x3");
		int x3=sc.nextInt();
		System.out.println("Enter Value of x4");
		int x4=sc.nextInt();
		System.out.println("Enter Value of x5");
		int x5=sc.nextInt();
		System.out.println("Enter Value of x6");
		int x6=sc.nextInt();
		int total=(((((x1+x2)+x3)-x4)/x5)*x6);
		System.out.println("Total="+total);
	}
}
	