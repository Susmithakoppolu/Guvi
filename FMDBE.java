import java.util.*;
import java.lang.*;
import java.io.*;
class FMDBE
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int temp=0,m=0,i,j,min=0;
	  int a[]=new int[n];
	  for(i=0;i<n;i++)
	  a[i]=sc.nextInt();
	  for(i=0;i<n;i++)
	{
	for(j=i+1;j<n;j++)
	{
		if(a[i]<a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	 min=a[0];
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			m=a[i]-a[j];
			if(m>0)
			if(m<min)
			{
				min=m;
			}
			
		}
	}
	System.out.println(min);
}
}
