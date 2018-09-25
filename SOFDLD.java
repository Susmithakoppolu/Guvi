import java.util.*;
import java.lang.*;
import java.io.*;
class SOFDLD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0,count=0;
		int a[]=new int[30];
		while(n!=0)
		{
		a[m]=n%10;
		n=n/10;
		m++;
		count++;
		}
		System.out.println(a[0]+a[count-1]);
		
	}
}
