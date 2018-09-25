import java.util.*;
import java.lang.*;
import java.io.*;
class KFPIN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),p=sc.nextInt(),k=sc.nextInt();
		int m=0;
		int a[]=new int[30];
		while(n!=0)
		{
		a[m]=n%10;
		n=n/10;
		m++;
		}
		System.out.println(a[p-1]);
		
	}
}
