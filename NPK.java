import java.util.*;
import java.lang.*;
import java.io.*;
class NPK
{
	public static boolean isPower(int n,int k)
	{
		while(n!=1)
		{
			if(n%k!=0)
			return false;
			else
			n=n/k;
		}
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		boolean flag=isPower(n,k);
		if(flag)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
