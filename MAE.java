import java.util.*;
import java.lang.*;
import java.io.*;
class MAE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int sum=1;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=sum*a[i];
		}
		System.out.println(Math.abs(sum));
		
	}
}
