import java.util.*;
public class digitword{
	public static void main(String args[])
	{
		int no,digit,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		no = sc.nextInt();
		while(no>0)
		{
			temp= (no%10)+(temp*10);
			no= no/10;
		}
		while(temp>0)
		{
			digit=temp%10;
			switch(digit)
			{
				case 0:
				System.out.print("ZERO ");
				break;
				case 1:
				System.out.print("ONE ");
				break;
				case 2:
				System.out.print("TWO ");
				break;
				case 3:
				System.out.print("THREE ");
				break;
				case 4:
				System.out.print("FOUR ");
				break;
				case 5:
				System.out.print("FIVE ");
				break;
				case 6:
				System.out.print("SIX ");
				break;
				case 7:
				System.out.print("SEVEN ");
				break;
				case 8:
				System.out.print("EIGHT ");
				break;
				case 9:
				System.out.print("NINE ");
				break;
			}
			temp=temp/10;
		}
	}
}