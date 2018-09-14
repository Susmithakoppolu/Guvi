import java.util.*;
import java.lang.*;
import java.io.*;
class FON
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int fact=factorial(n);
	    System.out.println(fact);
	}
	public static int factorial(int n)
	{
		if(n==0)
		return 1;
		else
		return n*factorial(n-1);
		
	}
}
