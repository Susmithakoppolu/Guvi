import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int t;
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(a[i]>a[j])
		{
			 t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		}
		
		}
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
	}
}
