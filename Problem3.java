package tendomloop;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		
		for(int i=1;a>1;i++)
		{
			int count=1;
			int temp=1;
			if(i%2!=0)
			{
				System.out.print(i+",");
				a--;
				
			}
			else
			{
				count=count+2;
				temp=temp+4;
				System.out.print(count+","+temp);
				a--;
			}
			
		
		}
	}

}
