import java.io.*;
import java.util.*;
class Convert
{
    public static void main(String[] args) 
    {
        int n, count = 0, a;
        Scanner sc = new Scanner(System.in);
       
        n = sc.nextInt();
        String x = "";
        while(n > 0)
        {
            a = n % 2;
            
            x = x + "" + a;
            n = n / 2;
        }
         StringBuilder sb=new StringBuilder(x);
        System.out.println(sb.reverse());
    }
}
