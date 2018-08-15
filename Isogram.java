/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Isogram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		isIsogram(str);
	}
	static void isIsogram(String s){
        String[] ary = s.split("");
        Set<String> mySet = new HashSet<String>(Arrays.asList(ary));

        if(s.length() == mySet.size()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
