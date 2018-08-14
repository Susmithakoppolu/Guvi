/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MulofFive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	            if(n%10==0)
	            System.out.println(n);
	            else
	            {
	            	n=(n/10)*10;
	            	int b=n+10;
	            	System.out.println(b);
	            }
		
	}
}
