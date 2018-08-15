/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Area
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		float l=sc.nextFloat(),b=sc.nextFloat();
		float area=l*b;
		System.out.printf("%.5f",area);
		
		
	}
}
