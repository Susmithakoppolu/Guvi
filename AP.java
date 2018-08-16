/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
		int a=A,d=B,n=C;
		int res=(n*((2*a)+(n-1)*d))/2;
		System.out.println(res);
	}
}
