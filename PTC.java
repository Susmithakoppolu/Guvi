import java.util.*;
import java.lang.*;
import java.io.*;
class PTC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		for(int i=0;i<n;i=i+3)
		System.out.print(str.charAt(i));
		
	}
}
