import java.util.*;
import java.lang.*;
import java.io.*;
class SubsetArray
{
        public static boolean isSubset(int arr1[], int arr2[], int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
                if(arr2[i] == arr1[j])
                    break;
             
            /* If the above inner loop 
            was not broken at all then
            arr2[i] is not present in
            arr1[] */
            if (j == m)
                return false;
        }
         
        /* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int j=0;j<m;j++)
		b[j]=sc.nextInt();
		boolean flag=isSubset(a,b,n,m);
		if(flag==true)
      System.out.println("YES");
      else
      System.out.println("NO");
	}
}
