import java.util.*;
import java.lang.*;
import java.io.*;
class NPKP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int npk=fact(n)/(fact(n-k));
		System.out.println(npk);
	}
public static  int fact( int x)
   {
      int f=1;
     int i;
     for(i=1;i<=x;i++)
       f=f*i;
     return(f);
   }
}
