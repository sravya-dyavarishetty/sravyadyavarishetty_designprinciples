package myfirst;
import java.util.*;
public class Epamtask2 {
	static int a;
	static int b;
	static Scanner scan=new Scanner(System.in);
	public static void read()
	{
		System.out.println("Enter first operand");
		a=scan.nextInt();
		System.out.println("Enter second operand");
		b=scan.nextInt();
	}
	public static void show(int value)
	{
		System.out.println(value);
	}
	public static int add(int val1,int val2)
	{
		int val3=Integer.MIN_VALUE;
		val3=val1+val2;
		return val3;
	}
	public static int subtract(int val1,int val2)
	{
		int val3=Integer.MIN_VALUE;
		val3=val1-val2;
		return val3;
	}
	public static int multi(int val1,int val2)
	{
		int val3=Integer.MIN_VALUE;
		val3=val1*val2;
		return val3;
	}
	public static int divide(int val1,int val2)
	{
		int val3=Integer.MIN_VALUE;
		if(val2==0)
			return val3;
		else
			val3=val1/val2;
		return val3;
	}
	public static void check(char ch)
	{
		int x=0;
		int flag=1;
		switch(ch)
		{
			case '+':
				System.out.println("It is Addition Operation");
				x=add(a,b);
				break;
			case '-':
				System.out.println("It is Subtraction Operation");
				x=subtract(a,b);
				break;
			case '*':
				System.out.println("It is Multiplication Operation");
				x=multi(a,b);
				break;
			case '/':
				System.out.println("It is Division Operation");
				if(b!=0)
				{
					x=divide(a,b);
				}
				else
				{
					System.out.println("Division is not possible with divisor Zero ");
					flag=0;
				}
				break;
			default:
				flag=0;
				System.out.println("It is not a Arithmetic operator");
		}
		if(flag==1)
		{
			show(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		System.out.println("Enter the Arithmetic operator");
		char operator=(scan.next()).charAt(0);
		check(operator);
		
	}
}