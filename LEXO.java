import java.io.*;
import java.util.*;
import java.lang.*;
class LEXO { 
      
// function to sort the 
// array of string 
static void sort(String a[], int n) 
{ 
      
    //sort the array 
    for(int i = 0;i < n;i++) 
    { 
        for(int j = i + 1;j < n;j++) 
        { 
              
            // comparing which of the 
            // two concatenation causes 
            // lexiographically smaller 
            // string 
            if((a[i] + a[j]).compareTo(a[j] + a[i]) > 0) 
            { 
                String s = a[i]; 
                a[i] = a[j]; 
                a[j] = s; 
            } 
        } 
    } 
} 
      
static String lexsmallest(String a[], int n) 
{ 
      
    // Sort strings 
    sort(a,n); 
  
    // Concatenating sorted strings 
    String answer = ""; 
    for (int i = 0; i < n; i++) 
        answer += a[i]; 
  
    return answer; 
} 
  
// Driver code 
public static void main(String args[]) 
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String a[]=new String[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextLine();
	}
    
    System.out.println(lexsmallest(a, n)); 
  
} 
} 
  
