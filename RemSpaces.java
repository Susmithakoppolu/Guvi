import java.util.*;
import java.lang.*;
import java.io.*;
class RemSpaces
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			str1+=str.charAt(++i);
			else
			str1+=str.charAt(i);
			
		}
		System.out.println(str1);
	}
}
