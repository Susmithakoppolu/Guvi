import java.util.*;
import java.lang.*;
import java.io.*;
class ASON
{
	public static boolean isSorted(int[] a){
		int i;
	for(i = 0; i < a.length - 1 && a[i] < a[i+1]; i++){}
             return (i == a.length - 1);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
                         int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		boolean flag=isSorted(a);
		if(flag)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
