package maventestpack;

public class Threemethod 
{
public static void add()
{
	int a=10,b=20;
	int sum;
	sum=a+b;
	System.out.println("Sum is " +sum);
}
public static void sub()
{
	int a=40,b=20;
	int sum;
	sum=a-b;
	System.out.println("Sum is " +sum);
	}
public static void mul()
{
	int a=10,b=20;
	int sum;
	sum=a*b;
	System.out.println("Sum is " +sum);
}
public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	Threemethod.add();
	Threemethod.sub();
	Threemethod.mul();
	}
}
