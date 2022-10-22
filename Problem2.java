package tendomloop;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		for(int i=1;a>0;i++)
		{
			if(i%2!=0)
			{
			System.out.print(i+",");
			a--;
			}
		}
	}

}
