import java.util.*;
import java.lang.*;
import java.io.*;
class AS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		sum+=a[i];
		System.out.println(sum);
	}
}
