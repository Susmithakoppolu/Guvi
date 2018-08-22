import java.util.*;
import java.lang.*;
import java.io.*;
class Isomorphic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next(),str1=sc.next();
		boolean flag=isIsomorphic(str,str1);
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("no");
	}
                public static boolean isIsomorphic(String a, String b) {
		if(a == null || b == null) 
		{
			return false;
		}
		if(a.length() != b.length()) 
		{
			return false;
		}
		Map<Character, Character> characterMap = new HashMap<Character, Character>();
		for(int i=0; i<a.length(); i++) {
			char c1 = a.charAt(i);
			char c2 = b.charAt(i);
			if(characterMap.containsKey(c1)) 
			{
				if(characterMap.get(c1) != c2) 
				{
					return false;
				}
			}
			else 
			{
				if(characterMap.containsValue(c2)) 
				{
					return false;
				}
				characterMap.put(c1, c2);
			}
		}
		return true;
	}
}
