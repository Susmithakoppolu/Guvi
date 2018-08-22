import java.util.*;
import java.lang.*;
import java.io.*;
class Camel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
	            StringBuffer sb=new StringBuffer(string);
                       for(int i=0;i<sb.length();i++)
                       {
                       if(i==0 || sb.charAt(i-1)==' ')
                       sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                       if(i!=0 && sb.charAt(i-1)!=' ')
                       sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
                       }
                       System.out.println(sb.toString());
	}
}
