import java.util.*;
import java.lang.*;
import java.io.*;
class ER
{
	static void printFirstRepeating(int arr[])
    {
        // Initialize index of first repeating element
        int min = -1;
 
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array from right to left
        for (int i=arr.length-1; i>=0; i--)
        {
            // If element is already in hash set, update min
            if (set.contains(arr[i]))
                min = i;
 
            else   // Else add element to hash set
                set.add(arr[i]);
        }
 
        // Print the result
        if (min != -1)
          System.out.println(arr[min]);
        else
          System.out.println("unique");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		printFirstRepeating(a);
		
	}
}
