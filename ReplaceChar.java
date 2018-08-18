import java.util.*;
import java.lang.*;
import java.io.*;
class ReplaceChar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	           Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder str=new StringBuilder(s);
		int len=str.length();
		int r=len/2;
		if(len%2==0)
		{
			str.setCharAt(r,'*');
			--r;
			str.setCharAt(r,'*');
		}
		else
		{
			str.setCharAt(r,'*');
		}
		System.out.println(str);
	}
}
