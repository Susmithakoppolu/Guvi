import java.util.*;
import java.lang.*;
import java.io.*;

class BAOAE { 
      
    // Returns value of "arr[0] & arr[1] + 
    // arr[0] & arr[2] + ... arr[i] & arr[j] +  
    // ..... arr[n-2] & arr[n-1]" 
    static int pairAndSum(int arr[], int n) 
    { 
        int ans = 0; // Initialize result 
      
        // Consider all pairs (arr[i], arr[j) 
        // such that i < j 
        for (int i = 0; i < n; i++) 
            for (int j = i+1; j < n; j++) 
            ans += arr[i] & arr[j]; 
      
        return ans; 
    } 
      
    // Driver program to test above function 
    public static void main(String args[]) 
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<n;i++)
        a[i]=sc.nextInt(); 
        int m = a.length;
        if(m==1)
        System.out.println(a[0]);
        else
        System.out.println(pairAndSum(a, m) ); 
    } 
} 
  
