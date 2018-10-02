import java.util.*;
import java.lang.*;
import java.io.*;
class SOAEIA
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			
			s=s+(a[i]+a[i+1]);
			
		}
		System.out.println(s);
		
	}
}
