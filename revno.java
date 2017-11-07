import java.util.*;
public class revno{
	public static void main(String args[])
	{
		int no,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		no = sc.nextInt();
		while(no>0)
		{
			rev= (no%10)+(rev*10);
			no= no/10;
		}
		System.out.println("The reversed number is "+rev);
	}
}