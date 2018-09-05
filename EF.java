import java.util.*;
import java.lang.*;
import java.io.*;
class EF
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i%2==0)
				{
					if(i!=n)
					System.out.print(i+" ");
				            else
				            System.out.print(i);
				}
			}
		}
	
	}
}
