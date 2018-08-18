/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
	            int a[]=new int[n];
	            for(int i=0;i<n;i++)
	            a[i]=sc.nextInt();
	            if(a[k]%2!=0)
	            System.out.println(a[k]);
	            else
	            System.out.println(a[k-1]);
	}
}
