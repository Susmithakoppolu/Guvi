import java.util.*;
import java.lang.*;
class MON
{      public static void main(String args[])  

{        String a[]={"01","02","03","04","05","06","07","08","09","10","11","12"};      
String v[]={"January","Febraury","Mar","April","May","June","July","August","September","October","November","december"};      
Scanner s=new Scanner(System.in);        
String h=s.nextLine();        
String j[]=h.split("-");        
for(int i=0;i<a.length;i++){           
if(j[1].equals(a[i])){               
System.out.println(v[i]);                   
break;    
}        
}           
}}
