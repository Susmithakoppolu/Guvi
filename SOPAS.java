import java.util.*;
import java.lang.*;
import java.io.*;
class SOPAS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		if(n==1)
		{
			System.out.print(a[n-1]);
		}
		else{
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			
		}
		for(int i=0;i<n;i++)
		{
		    int t=sum+a[i];
			if(i!=n-1){
			System.out.print(t+" ");
			}
			else
			System.out.print(t);
		}
		}
	}
}
