import java.util.*;
import java.lang.*;
import java.io.*;
class PT
{
	public static boolean PowerTwo(int n)
	{
	
		while(n!=1)
		{
		if(n%2!=0)
		return false;
		n=n/2;
		}
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=PowerTwo(n);
		if(flag)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
