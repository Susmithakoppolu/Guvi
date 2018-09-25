import java.util.*;
import java.lang.*;
import java.io.*;
class SDGR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int sum=0;
		for(int i=n;i<=k;i++)
		{
			if(i%2!=0)
			sum=sum+i;
		}
		System.out.println(sum);
		
	}
}
