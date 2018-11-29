import java.util.*;
import java.lang.*;
import java.io.*;
class CS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		String str1=sc.next();
		int s=str.length();
		int s1=str1.length();
		int n=s-s1;
		StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<n;i++)
        {
        	s--;
        sb.deleteCharAt(s);
        }
        str=sb.toString();
        System.out.println(str+str1);
	}
}
