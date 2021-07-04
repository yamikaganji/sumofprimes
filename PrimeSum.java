package basicjavaprograms;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range:");
		int n=sc.nextInt();
		int sum=0;
		for(int j=2;j<=n;j++)
		{
			if(isPrime(j))
			{
				sum=sum+j;
				if(isPrime(sum)&&sum<n)
				{
				System.out.println(sum);
				}
				
			}
		
		}
		
			
	}
	boolean flag=false;
	static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
