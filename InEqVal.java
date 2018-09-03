import java.util.*;
import java.lang.*;
import java.io.*;
class InEqVal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		if(i==a[i])
		{ 
		count+=1;
		if(i!=n-1)
		System.out.print(a[i]+" ");
		else
		System.out.print(a[i]);
		}
		}
		if(count==0)
		System.out.println(-1);
	}
}
