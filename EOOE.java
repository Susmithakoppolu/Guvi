import java.util.*;
import java.lang.*;
import java.io.*;


class EOOE
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i!=n-1){
			if(i%2==0 && a[i]%2!=0)
			System.out.print(a[i]+" ");
			else if(i%2!=0 && a[i]%2==0)
			System.out.print(a[i]+" ");
			}
			else{
		            if(i%2==0 && a[i]%2!=0)
			System.out.print(a[i]);
			else if(i%2!=0 && a[i]%2==0)
			System.out.print(a[i]);
				
			}
		}
	}
}
