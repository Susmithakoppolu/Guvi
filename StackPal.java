import java.util.*;
import java.lang.*;
import java.io.*;
class StackPal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		Stack st=new Stack();
		for(int i=0;i<str.length();i++)
		st.push(str.charAt(i));
		while(!st.isEmpty())
		{
			rev+=st.pop();
		}
		if(rev.equals(str))
		System.out.println("YES");
		else
		System.out.println("NO");
		
	}
}
