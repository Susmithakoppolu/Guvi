import java.util.*;
import java.lang.*;
import java.io.*;
class KPON
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int r;
		int count=0;
		while(n>0)
		{
			r=n%10;
			if(r==k){
			count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}
