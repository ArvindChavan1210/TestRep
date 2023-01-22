package Pkg1;

import java.util.Scanner;
public class Assgnment3_Method2 {
	public int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int sub (int c, int d) {
		int sub=c-d;
		return sub;
	}
	public float div (int e, int f) {
		float div=e/f;
		return div;
	}
	public float mul (float g, int h) {
		float mul=g*h;
		return mul;
	}
		public static void main(String[] args) {
		Assgnment3_Method2 obj= new Assgnment3_Method2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1=");
		int x1=sc.nextInt();
		System.out.println("Enter x2=");
		int x2=sc.nextInt();
		System.out.println("Enter x3=");
		int x3=sc.nextInt();
		System.out.println("Enter x4=");
		int x4=sc.nextInt();
		System.out.println("Enter x5=");
		int x5=sc.nextInt();
		System.out.println("Enter x6=");
		int x6=sc.nextInt();
		int sum1=obj.sum(x1, x2);
		int sum2=obj.sum(sum1, x3);
		int sub1=obj.sub(sum2, x4);
		float div1=obj.div(sub1, x5);
		float mul1=obj.mul(div1,x6);
		System.out.println("Output="+mul1);
		sc.close();
		
				
	}

}
