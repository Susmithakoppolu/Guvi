/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HighSmall
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int max=a[0];
		int min=a[0];
		for(int i=0;i<n;i++)
		{
		if(max<a[i])
		max=a[i];
		else max=max;
		if(min>a[i])
		min=a[i];
		else
		min=min;
		}
		System.out.println(min+" "+max);
	}
}
