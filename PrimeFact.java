import java.util.*;
import java.lang.*;
import java.io.*;
class PrimeFact
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int a[]=new int[10];

		for (int i = 2; i <= number; i++) 
		{
 
                         if (number % i == 0) 
                         {
                            
                            System.out.print(i+" ");
                            number = number / i;
                         }
                        }
                       
                   
	}
}
