package Pkg1;

public class Assignment2 {
	public float div(int a, int b)
	{
		float div=a/b;
		System.out.println("Division is: "+div);
		return div;
	}
	public int sum(int a1, int b1)
	{
		int sum=a1+b1;
		System.out.println("Sumession is: "+sum);
		return sum;
	
	}
	public int sub(float division, int b2)
	{
		float sub=division-b2;
		System.out.println("Substraction is: "+sub);
		return(int) sub;
	}
	public int mul(int a3, int b3)
	{
		int mul=a3*b3;
		System.out.println("Multiplication is: "+mul);
		return mul;
	}
public static void main(String[] args) {
	Assignment2 obj= new Assignment2();
	float Division = obj.div(10, 2);
	int sub1=obj.sub(Division, 2);
	int sum=obj.sum(sub1, 2);
	int sub2=obj.sub(sum, 2);
	int mul=obj.mul(sub2, 2);
	System.out.println("Final Result is: "+mul);
	
}
}
