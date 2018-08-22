import java.util.*;
import java.lang.*;
import java.io.*;
class DivMod
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char ch=sc.next().charAt(0);
		int b=sc.nextInt();
	            if(ch=='/')
	            {
	            	System.out.println(a/b);
	            }
	            else
	            System.out.println(a%b);
	}
}
