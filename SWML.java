import java.util.*;
import java.lang.*;
import java.io.*;
class SWML
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n,i,j;
        String s="";
        String a=sc.nextLine();
        String[] str=a.split(" ");
        for(i=0;i<str.length-1;i++)
        {
        	if(str[i].length()==str[i+1].length())
        	{
        		System.out.println(str[i]);
        		break;
        	}
        	else if(str[i].length()>str[i+1].length())
        	{
        		System.out.println(str[i]);
        		break;
        	}
        	else{ 
        	System.out.println(str[i+1]);
        	break;
        	}
        }
	
	System.out.println(s);
	}
}
