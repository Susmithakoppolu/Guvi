import java.util.*;
import java.lang.*;
import java.io.*;
class NearZero
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		  for(int j=i+1;j<n;j++)
		  {
		  	
		  	if(a[i]+a[j]==0){
		  	System.out.println(a[i]+" "+a[j]);
		  	break;
		  	}
		  }
		}
	}
}
