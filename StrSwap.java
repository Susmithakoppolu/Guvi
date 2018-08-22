import java.util.*;
import java.lang.*;
import java.io.*;
class StrSwap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s1="";
		String s2="";
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			s1=s1+str.charAt(i);
			else
			s2=s2+str.charAt(i);
		}
		for(int i=0;i<s1.length();i++)
		{
			result+=s2.charAt(i);
			result+=s1.charAt(i);
		}
		System.out.println(result);
	}
}
