

import java.util.*;
import java.lang.*;
import java.io.*;
class CountSp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int ch=0;
		for(int i=0;i<str.length();i++)
		{
			if(!(Character.isDigit(str.charAt(i))) && !(Character.isAlphabetic(str.charAt(i))))
	
			ch++;
		}
		System.out.println(ch);
	}
}
