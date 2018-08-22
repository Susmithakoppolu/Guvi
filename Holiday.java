import java.util.*;
import java.lang.*;
import java.io.*;
class Holiday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.equals("saturday") || str.equals("sunday"))
		System.out.println("yes");
		else
		System.out.println("no");
	}

}
