package tendomloop;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[]n= {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter the value for a");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%n[i]==0)
				{
					count++;
				}
			}
			System.out.print(n[i]+":"+count+",");
		}
			
		}
	}


