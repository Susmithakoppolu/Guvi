import java.util.*;
import java.lang.*;
import java.io.*;
class NonRepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int n, flag = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        if(n==1)
        {
        	for(int i=0;i<n;i++)
        	System.out.println(a[i]);
        }
        else{
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    if(a[i] != a[j])
                    {
                        flag = 1;
                    }
                    else
                    {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
            {
               
                System.out.print(a[i]);
            }
        }
	}
	}
}
