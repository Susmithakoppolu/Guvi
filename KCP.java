import java.util.*;
import java.lang.*;
import java.io.*;
class KCP
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 String str=sc.next();
	 char k=sc.next().charAt(0);
	 int pos=0;
            for(int i=0;i<str.length();i++)
            {
            	if(str.charAt(i)==k)
            	{
            	 pos=i;
            	 break;
            	}
            }
            System.out.println(pos+1);
}
	
}
