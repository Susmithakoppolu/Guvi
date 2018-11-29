import java.util.*;
import java.lang.*;
import java.io.*;
class RAP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n,i;
        String a=sc.nextLine();
        n=a.length();
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        String b=sb.toString();
        char ch[]=b.toCharArray();
        for(i=0;i<n;i++)
        {
         System.out.print(ch[i]);
        if(i==n-1)
        {
         break;
         }
        System.out.print("-");
        }
	}
}
