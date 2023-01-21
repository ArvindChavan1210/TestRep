package Pkg1;

public class Assignment1 {
	public int sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum is: "+sum);
		return sum;
	}
	public int sub(int a1, int b1)
	{
		int sub=a1-b1;
		System.out.println("Sub is: "+sub);
		return sub;
		
	}
	public int mul (int a2, int b2)
	{
		int mul=a2*b2;
		System.out.println("Multiplication is : "+mul);
		return mul;
				
	}
	public float div (int a3, int b3)
	{
		float div=a3/b3;
		System.out.println("division is : "+div);
		return div;
				
	}
public static void main(String[] args) {
	Assignment1 obj= new Assignment1();
	int sum1=obj.sum(10, 2);
	int sum2=obj.sum(sum1, 2);
	int sub=obj.sub(sum2, 2);
	int mul=obj.mul(sub, 2);
	float div=obj.div(mul, 2);
	System.out.println("Final total is: "+ div);
}

}
