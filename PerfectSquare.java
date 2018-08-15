/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PerfectSquare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int pr=n*m;
		int sqr=(int)Math.sqrt(pr);
		if(sqr*sqr==pr)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
