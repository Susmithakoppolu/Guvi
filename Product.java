/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Product
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		while(n>0)
		{
			int r=n%10;
			s=s*r;
			n=n/10;
		}
		System.out.println(s);
	}
}
