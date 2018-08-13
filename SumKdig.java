/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumKdig
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int k=sc.nextInt();
		for(int i=1;i<=k;i++)
		sum=sum+i;
		System.out.println(sum);
	}
}
