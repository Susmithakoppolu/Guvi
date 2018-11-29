import java.util.*;
import java.lang.*;
import java.io.*;
class WP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		String[] s3=s1.split(" ");
		int i=0;
		for(i=0;i<s3.length;i++)
		{
			if(s3[i].charAt(0)==s2.charAt(0))
			{
				break;	
			}
		}
		System.out.println(i+1);
	}
}
