import java.util.*;
import java.lang.*;
import java.io.*;
class MDBE
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int max=0,temp=0;
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
	   for(int j=0;j<n;j++)
	   {
	     temp=a[i]-a[j];
	     if(temp>max)
	     max=temp;
	     else
	     max=max;
	   }
	  }
	  System.out.println(max);
}
}
