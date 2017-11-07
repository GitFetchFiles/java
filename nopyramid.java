import java.util.Scanner;
 
public class nopyramid
{
    public static void main(String[] args)
    {   int i,j,rowcount,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");
        n = sc.nextInt();
        rowcount = 1;
        System.out.println("Here Is Your Pyramid");
        for (i = n; i > 0; i--)
        {

 
            for (j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 

 
            for (j = 1; j <= rowcount; j++)             
            {
                System.out.print(j+" ");
            }
 

             
            for (j = rowcount-1; j >= 1; j--)
            {                 
                System.out.print(j+" ");             
            }                          
             
            System.out.println();
            rowcount++;
        }
    }
}