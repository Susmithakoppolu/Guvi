import java.util.*;
import java.lang.*;
import java.io.*;
class EPON
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			flag=true;
		}
		if(flag)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
