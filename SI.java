/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt(),t=sc.nextInt(),r=sc.nextInt();
		int si=(p*t*r)/100;
		System.out.println((int)Math.floor(si));
	}
}
