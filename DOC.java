import java.util.*;
import java.lang.*;
import java.io.*;
class DOC
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		String str=sc.next(),str1=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str1.charAt(i))
			count+=1;
		}
		if(count==1)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
