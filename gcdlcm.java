import java.util.*;
public class gcdlcm
{
	static int gcd,lcm,a,b;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		gcd=calculategcd(a,b);
		lcm=calculatelcm(a,b,gcd);
		System.out.println("The gcd is "+gcd);
		System.out.println("The lcm is "+lcm);
	}
	public static int calculategcd(int a,int b)
	{
		if(a==0)
			return b;
		else
			return calculategcd(b%a,a);
	}
	public static int calculatelcm(int a,int b,int gcd)
	{
		return(a*b)/gcd;
	}
}