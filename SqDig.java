import java.util.*;
import java.lang.*;
import java.io.*;
class SqDig
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		while(n>0)
		{
			int r=n%10;
			s+=r*r;
			n=n/10;
		}
		System.out.println(s);
	}
}
