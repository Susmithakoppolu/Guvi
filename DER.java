import java.util.*;
import java.lang.*;
import java.io.*;
class DER
{
    public static int removeDuplicates(int a[], int n) 
    { 
        if (n==0 || n==1) 
            return n; 
       
        int[] temp = new int[n]; 
           int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (a[i] != a[i+1]){  
                temp[j++] = a[i];  
            }  
         }  
        temp[j++] = a[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            a[i] = temp[i];  
        }  
        return j;  
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++){
	  a[i]=sc.nextInt();
	  }
	  int m=removeDuplicates(a,n);
	  for(int i=0;i<m;i++)
	  {
	  	if(i!=m-1)
	  	 System.out.print(a[i]+" ");
	  	 else
	  	  System.out.println(a[i]);
	  }
	 
	}
}
