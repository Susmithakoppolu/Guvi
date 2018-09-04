import java.util.*;
import java.lang.*;
import java.io.*;
class PerfectS
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int l=sc.nextInt(),r=sc.nextInt();
	  int count=0;
	  for(int i=l;i<=r;i++)
	  {
	  	int num=i;
	  	int s=(int)Math.sqrt(num);
	  	if(s*s==num)
	  	count++;
	  }
	  System.out.println(count);
	}
}
