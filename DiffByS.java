import java.util.*;
import java.lang.*;
import java.io.*;
class DiffByS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str1.charAt(i))
			count++;
			
		}
		if(count==k)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
