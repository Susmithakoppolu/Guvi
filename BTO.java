import java.util.*;
import java.lang.*;
import java.io.*;
class BTO
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int p=0,octal=0,i,decimal=0;
	  while(n!=0)
	  {
	  	decimal+=((n%10)*Math.pow(2,p));
	  	n=n/10;
	  	p++;
	  }
	  i = 1;

        while (decimal != 0)
        {
            octal += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

       
	  System.out.println(octal);
	}
}
