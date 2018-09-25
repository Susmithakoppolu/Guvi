import java.util.*;
import java.lang.*;
import java.io.*;
class RDIN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0;
		boolean flag=false;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		while(n!=0)
		{
		m=n%10;
		if(map.containsKey(m))
		{
			map.put(m,map.get(m)+1);
		}
		else{
		map.put(m,1);
		}
		n=n/10;
		}
		Set<Integer> keys=map.keySet();
		for(Integer key:keys)
		{
			if(map.get(key)>1){
			flag=true;
			break;
			}
			else{
			flag=false;
			}
		}
		if(flag)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
