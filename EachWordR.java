import java.util.*;
import java.lang.*;
import java.io.*;
class EachWordR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String words[]=str.split(" ");
		String rev="";
		for(String w:words){
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		rev+=sb+" ";
		}
		System.out.println(rev.trim());
	}
}
