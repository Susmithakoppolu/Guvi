/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PalorN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0,s=0;
		int t=n;
		while(n>0)
		{
		 r=n%10;
		 s=s*10+r;
		 n=n/10;
		}
		if(t==s)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
