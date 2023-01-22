package Pkg1;

import java.util.Scanner;
public class Assgnmnet4_Method2 {
	public int mul(int a, int b) {
		int mul=a*b;
		return mul;
	}
	public int sub(int c, int d) {
		int sub=c-d;
		return sub;
			}
	public int sum(int e, int f) {
		int sum=e+f;
		return sum;
	}
	public float div(int h, int i) {
		float div=h/i;
		return div;
	}
	public static void main(String[] args) {
		Assgnmnet4_Method2 obj=new Assgnmnet4_Method2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of x1");
		int x1=sc.nextInt();
		System.out.println("Enter Value of x2");
		int x2=sc.nextInt();
		System.out.println("Enter Value of x3");
		int x3=sc.nextInt();
		System.out.println("Enter Value of x4");
		int x4=sc.nextInt();
		System.out.println("Enter Value of x5");
		int x5=sc.nextInt();
		System.out.println("Enter Value of x6");
		int x6=sc.nextInt();
		int mul1=obj.mul(x1, x2);
		int sub1=obj.sub(mul1, x3);
		int sum1=obj.sum(sub1, x4);
		int sub2=obj.sub(sum1, x5);
		float div=obj.div(sub2, x6);
		System.out.println("Output="+div);
		
	}
	

}
