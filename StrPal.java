/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StrPal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r="";
		for(int i=s.length()-1;i>=0;--i)
		{
			r=r+s.charAt(i);
		}
		if(r.equals(s))
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
