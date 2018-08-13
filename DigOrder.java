/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class DigOrder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer>stack=new LinkedList<Integer>();
		while(n>0)
		{
			stack.push(n%10);
			n=n/10;
		}
		while(!stack.isEmpty())
		System.out.printf(stack.pop()+" ");
		
	}
}
