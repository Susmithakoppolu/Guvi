import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
class DVON
{
	public static void validateJavaDate(String strDate)
   {
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/mm/yyyy");
	    sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println("yes");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        System.out.println("no");
	       
	    }
	   
	
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		validateJavaDate(str);
	}
}
