import java.util.*;
import java.lang.*;
import java.io.*;
class ULLU
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		String s="";
		for(int i=0;i<str.length();i++)
	{
		if(c[i]>='a' && c[i]<='z')
		s=s+Character.toString(c[i]).toUpperCase();
		else
		s=s+Character.toString(c[i]).toLowerCase();
	}
	System.out.print(s);
	}
}
