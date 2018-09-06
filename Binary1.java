import java.util.Scanner;
class Binary1
{

    String B;
    int temp;

    void printB(int n)
    {
        for(int i = 0; i < Math.pow(2,n); i++)
        {
            B = "";
            temp = i;
            for (int j = 0; j < n; j++)
            {
                if (temp%2 == 1)
                    B = '1'+B;
                else
                    B = '0'+B;
                    temp = temp/2;
            }
            System.out.println(B);
         }
    } 
}

class Runner
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Binary1 myB = new Binary1();

        myB.printB(n);
    }
}
