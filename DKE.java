import java.util.*;
import java.lang.*;
import java.io.*;
class DKE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int max=n-k;
		for(int i=0;i<max;i++)
		{
		if(i!=max-1)
		System.out.print(a[i]+" ");
		else
		System.out.print(a[i]);
		}
	}
}
