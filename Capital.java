/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Capital
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=toFirstCharUpperAll(s);
		System.out.println(str);
	}
	public  static String toFirstCharUpperAll(String string){
                      StringBuffer sb=new StringBuffer(string);
                      for(int i=0;i<sb.length();i++)
                       if(i==0 || sb.charAt(i-1)==' ')//first letter to uppercase by default
                       sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                    return sb.toString();
}
}
