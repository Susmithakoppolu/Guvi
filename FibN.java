/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FibN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f1=0;
		int f2=1;
		System.out.print(f2);
		for(int i=0;i<n-1;i++)
		{
			int f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
	
		}
	}
}
