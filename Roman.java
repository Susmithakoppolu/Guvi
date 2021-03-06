import java.util.*;
import java.lang.*;
import java.io.*;
class Roman
{
	final static char symbol[] = {'M','D','C','L','X','V','I'};
	final static int   value[] = {1000,500,100,50,10,5,1};

	public static int valueOf(String roman)
	{
		roman = roman.toUpperCase();
		if(roman.length() == 0) return 0;
		for(int i = 0; i < symbol.length; i++)
		{
			int pos = roman.indexOf(symbol[i]) ;
			if(pos >= 0)
				return value[i] - valueOf(roman.substring(0,pos)) + valueOf(roman.substring(pos+1));
		}
		throw new IllegalArgumentException("Invalid Roman Symbol.");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int res=valueOf(str);
		System.out.println(res);
	}
}
