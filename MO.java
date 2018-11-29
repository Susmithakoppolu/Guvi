import java.util.*;
import java.lang.*;
import java.io.*;
class MO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long r=(long)Math.pow(a,b);
		System.out.println(r%c);
	}
}
