import java.util.*;
import java.lang.*;
import java.io.*;
class DBN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				flag=true;
			}
		}
		if(flag)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
