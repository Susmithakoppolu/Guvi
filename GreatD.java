import java.util.*;
import java.lang.*;
import java.io.*;
class GreatD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(),n2=sc.nextInt();
		 int gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.print(gcd);
	}
}
