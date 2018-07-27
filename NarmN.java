/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NarmN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	  int b=sc.nextInt();
	  int s=0;
		for(int i=a+1;i<b;i++)
		{
		int n=i;
		while(n>0)
		{
		int r=n%10;
		s=s+(r*r*r);
		n=n/10;
		}
		if(s==i)
		{
		System.out.println(s);
		}
		s=0;
		}
	}
}
