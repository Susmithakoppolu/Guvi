import java.util.Scanner;
 
class BTD
{
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            
           
            long n=s.nextLong();
            
            int decimal=0,p=0;
            
            while(n!=0)
            {
                decimal+=((n%10)*Math.pow(2,p));
                n=n/10;
                p++;
            }
            
            System.out.println(decimal);
        }
}
 
