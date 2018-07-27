/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LeaporN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
    boolean flag=false;
		if(year%4==0)
		{ 
			if(year%100==0)
			{
				if(year%400==0)
				flag=true;
				else
				flag=false;
			}
			else {
			flag=true;
			}
		}
		else{
	            flag=false;
		}
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("no");
			
	}
}
