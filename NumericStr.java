import java.util.*;
import java.lang.*;
import java.io.*;
class NumericStr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
	    for(int i=0;i<str.length();i++)
	    {
	    	if(Character.isDigit(str.charAt(i)))
	    	count+=1;
	    }
	    if(count==str.length())
	    System.out.println("yes");
	    else
	    System.out.println("no");
	}
}
