import java.util.Scanner;
public class sumofdigits{
	public static void main(String args[])
	{
		int no,remainder,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number");
		no = sc.nextInt();
		while(no>0)
		{
				remainder = no%10;
				sum= sum+ remainder;
				no=no/10;
		}
		System.out.println("sum of digits is = "+sum);
	}
}