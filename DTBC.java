import java.util.*;
import java.lang.*;
import java.io.*;
class DTBC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,a,l=1;
        if(n==0)
        {
        	System.out.println(l);
        }
        else{
        while(n>0)
        {
        	a=n%2;
        	n=n/2;
        	count++;
        }
        System.out.println(count);
        }
	}
}
