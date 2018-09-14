import java.util.*;
import java.lang.*;
import java.io.*;
class LEC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int max=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j]){
				count++;
				}
			}
			if(count>max)
			max=count;
		}
		System.out.println(max);
	}
}
