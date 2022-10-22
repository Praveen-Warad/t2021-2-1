package tendomloop;

import java.util.Scanner;

public class Problem1 {
public static void main(String[] args) {
	char operation;
	double a,b,res;
	Scanner sc=new Scanner(System.in);
	System.out.println("choose the operation which is required:+,-,*,/");
	operation=sc.next().charAt(0);
	
	System.out.println("Enter the value of a");
	a=sc.nextDouble();
	
	System.out.println("Enter the value of b");
	b=sc.nextDouble();
	
	switch(operation) {
	case'+':
		res=a+b;
		System.out.println(a+"+"+b+"="+res);
		break;
	case'-':
		res=a-b;
		System.out.println(a+"-"+b+"="+res);
		break;
	case'*':
		res=a*b;
		System.out.println(a+"*"+b+"="+res);
		break;
	case'/':
		res=a/b;
		System.out.println(a+"/+"+b+"="+res);
		break;
		default:
		{
			System.out.print("Its not valid");
		}
	}
}
}
