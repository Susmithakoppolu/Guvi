import java.util.*;
import java.lang.*;
import java.io.*;
class OddNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer>stack=new LinkedList<Integer>();
		while(n!=0)
		{
			int r=n%10;
			n=n/10;
			if(r%2!=0)
			{
			stack.push(r);
			}
			
		}
	
		while(!stack.isEmpty())
		{
	             System.out.print(stack.pop()+" ");
	            
		}
	}
}
