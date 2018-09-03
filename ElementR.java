import java.util.*;
import java.lang.*;
import java.io.*;

class ElementR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int b[]=new int[10];
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			
				if(a[i]==a[j])
				{
				   b[count]=a[i];
				   count+=1;
				}
				
			
			}
		}
	
		if(count>0)
		for(int i=0;i<count;i++)
		{
			if(i!=count-1)
			System.out.print(b[i]+" ");
			else
			System.out.print(b[i]);
		}
		else
		{
			System.out.println("unique");
		}
	}
}
