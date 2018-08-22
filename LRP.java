import java.util.*;
import java.lang.*;
import java.io.*;
class LRP
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt(),r=sc.nextInt();
		int count=0;
		for(int i=l;i<=r;i++)
		{
			int counter=0; 	  
                              for( int num=i; num>=1; num--)
                              {
                              	if(i%num==0)
                              	{
 		                counter=counter + 1;
	                        }
                              }
	                  if(counter==2)
	                  	count+=1;
		}
			System.out.println(count);
	
	}
}
