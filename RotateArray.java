import java.util.*;
import java.lang.*;
import java.io.*;
class RotateArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		if(n==1)
		{
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);
		}
		else{
                       RotateArray rotate = new RotateArray();
                       rotate.rightRotate(arr, k, n);
                       rotate.printArray(arr, n);
		}
                      
	}
	public static void rightRotate(int arr[], int k, int n) 
    {
    	
        for (int i = 0; i < k; i++)
            rightRotatebyOne(arr, n);
            
    }
	
public static void rightRotatebyOne(int arr[], int n)
{
   int temp = arr[arr.length-1], i;
  
   
   for (i = arr.length-2; i>-1; --i)
   {
       arr[i+1] = arr[i];
   }
    
   arr[0] = temp;
   }
   
 public static void printArray(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
        {
        if(i!=n-1)
            System.out.print(arr[i] + " ");
            else
            System.out.println(arr[i]);
        }
    }
 
}
