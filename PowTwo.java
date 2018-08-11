/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PowTwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    if(power(n))
		System.out.println("yes");
		else
		System.out.println("no");
	}
  public static boolean power(int n)
	{
	  if(n==0)
	  return false;
		while(n!=1)
		{
			if(n%2!=0)
			return false;
			n=n/2;
		}
		return true;
	 }
}
