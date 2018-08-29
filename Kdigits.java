import java.util.*;
import java.lang.*;
import java.io.*;
class Kdigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int k=sc.nextInt();
		int len=n.length();
		String s1="";
		for(int i=k;i<len;i++)
		s1+=n.charAt(i);
		System.out.println(s1);
	}
}
