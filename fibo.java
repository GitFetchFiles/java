import java.util.*;
public class fibo
{	static int f0=0,f1=1,f=0,n;
	public static void main(String args[])
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n for the series");
		n=sc.nextInt();
		System.out.print(f0+" "+f1);
		series(n-2);
	}
	public static void series(int n)
	{
		if(n>0)
		{
			f=f0+f1;
			f0=f1;
			f1=f;
			System.out.print(" "+f);
			series(n-1);
		}
	}
}