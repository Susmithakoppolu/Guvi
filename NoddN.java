/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NoddN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
	  for(int i=n1;i<=n2;i++)
		{
		 if(i%2!=0)
		 System.out.print(i);
		 System.out.print(" ");
     }
	}
}
