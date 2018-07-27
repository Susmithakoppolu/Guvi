/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NprimeN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for (int i=a+1; i<b; i++)         
    { 		  	  
      int counter=0; 	  
      for( int num=i; num>=1; num--)
	     {
         if(i%num==0)
	        {
 		        counter=counter + 1;
	         }
	       }
	      if (counter==2)
	       {
	  	     System.out.print(i+" ");
	        }
      }
	}
}
