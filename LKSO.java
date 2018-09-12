import java.util.*;
import java.lang.*;
import java.io.*;
class LKSO
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),k=sc.nextInt();
	int temp;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		if(i!=n-1)
		if(a[i]<k)
		System.out.print(a[i]+" ");
		else
		if(a[i]<k)
		System.out.print(a[i]);
		
	}
	
	}
}
