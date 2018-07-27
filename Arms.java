/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arms
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int s=0;
		while(n>0)
		{
		int r=n%10;
		s=s+(r*r*r);
		n=n/10;
		}
		if(t==s)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
