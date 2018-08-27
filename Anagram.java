import java.util.*;
import java.lang.*;
import java.io.*;
class Anagram
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int count=1;
		int n=sc.nextInt();
		char s[]="kabali".toCharArray();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		str[i]=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			char ch[]=str[i].toCharArray();
			if(areAnagram(ch,s))
			count++;
		}
		System.out.println(count);
	}

 static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lenghts of both strings
        int n1 = str1.length;
        int n2 = str2.length;
  
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
  
        // Sort both strings
        quickSort(str1, 0, n1 - 1);
        quickSort(str2, 0, n2 - 1);
  
        // Compare sorted strings
        for (int i = 0; i < n1;  i++)
            if (str1[i] != str2[i])
                return false;
  
        return true;
    }
  
    // Following functions (exchange and partition 
    // are needed for quickSort)
    static void exchange(char A[],int a, int b)
    {
        char temp;
        temp = A[a];
        A[a]   = A[b];
        A[b]   = temp;
    }
  
    static int partition(char A[], int si, int ei)
    {
        char x = A[ei];
        int i = (si - 1);
        int j;
      
        for (j = si; j <= ei - 1; j++)
        {
            if(A[j] <= x)
            {
                i++;
                exchange(A, i, j);
            }
        }
        exchange (A, i+1 , ei);
        return (i + 1);
    }
  
    /* Implementation of Quick Sort
    A[] --> Array to be sorted
    si  --> Starting index
    ei  --> Ending index
    */
    static void quickSort(char A[], int si, int ei)
    {
        int pi;    /* Partitioning index */
        if(si < ei)
        {
            pi = partition(A, si, ei);
            quickSort(A, si, pi - 1);
            quickSort(A, pi + 1, ei);
        }
    }
}
  
