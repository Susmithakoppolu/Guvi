import java.util.*;
import java.lang.*;
import java.io.*;
class Capital
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	        toFirstCharUpperAll(s);
		
	}
	public  static void toFirstCharUpperAll(String string){
                      StringBuffer sb=new StringBuffer(string);
                      for(int i=0;i<sb.length();i++)
                       if(i==0 || sb.charAt(i-1)==' ')
                       sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                       System.out.println(sb.toString());
           }
}
