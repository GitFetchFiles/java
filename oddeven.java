import java.util.Scanner;
class oddeven
{
    public static void main(String args[])
    {
        int i;
        System.out.println("Enter the number");
        i= Integer.parseInt(args[0]);
        if(i%2==0)
        {
             System.out.println("No. is even");
        }
        else
        {
             System.out.println("No. is odd");
        }
    }
}