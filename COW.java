import java.util.*;
import java.lang.*;
import java.io.*;
class COW
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		String words[]=str.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++)
		{
		
				if(words[i].equals(str1))
				count++;
			
		}
		System.out.println(count);
	}
}
