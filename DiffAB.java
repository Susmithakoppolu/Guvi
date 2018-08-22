import java.util.*;
import java.lang.*;
import java.io.*;
class DiffAB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
	            if(a>b)
	            {
	            	System.out.println(a-b);
	            }
	            else
	            System.out.println(Math.abs(a-b));
	}
}
