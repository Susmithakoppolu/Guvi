import java.util.*;
import java.lang.*;
import java.io.*;
class CE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
        int b[]=new int[m];
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
         Arrays.sort(a);
        for(i=0;i<m;i++)
        {
         b[i]=sc.nextInt();
        }
         Arrays.sort(b);
         for(i=0;i<n;i++)
         {
	      for(j=0;j<m;j++)
	      {
           if(a[i]==b[j])
          System.out.print(a[i] + " ");
	}
         }
	}
}
