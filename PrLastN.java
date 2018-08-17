/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrLastN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		int initial=str.length()-n;
		for(int i=initial;i<str.length();i++)
		System.out.print(str.charAt(i));
	}
}
