import java.util.*;
import java.lang.*;
import java.io.*;
class KCC
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 String str=sc.next();
	 char k=sc.next().charAt(0);
	 int count=0;
            for(int i=0;i<str.length();i++)
            {
            	if(str.charAt(i)==k)
            	{
            	 count++;
            	}
            }
            System.out.println(count);
}
	
}
