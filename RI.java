import java.util.*;
import java.lang.*;
import java.io.*;
class RI
{
	public static int[] Maxele(int a[], int n)
	{

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			
		}
		return a;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		Maxele(a,n);
		for(int i=0;i<n;i++)
		{
			if(i!=n-1)
			System.out.print(n-i+" ");
			else
			System.out.print(n-i);
		}
		
		
	}
}
