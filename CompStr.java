/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.String.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CompStr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int result=str.compareTo(str1);
		if(result==0)
		System.out.println(str);
		else if(result<0)
		System.out.println(str1);
		else
		System.out.println(str);
	}
}
