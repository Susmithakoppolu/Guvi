import java.util.*;
import java.lang.*;
import java.io.*;
class MES
{
	public static int Maxele(int a[], int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int result=Maxele(a,n);
		System.out.println(result);
		
	}
}
