/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Simple
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int m=a*b;
		System.out.println(m%c);
		}
}
