import java.util.*;
import java.lang.*;
import java.io.*;
class FERO
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int count=0,temp=0,temp1=0;
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
	  	if(a[i]%2==0){
	  	count++;
	  	temp=a[i];
	  	}
	  	else if(a[i]%2!=0){
	  		temp1=a[i];
	  	}
	  	
	  }
	  if(count==1)
	  System.out.println(temp);
	  else
	  System.out.println(temp1);
}
}
