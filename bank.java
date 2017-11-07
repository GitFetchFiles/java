import java.util.Scanner;
class Customer
{
	String add;
	String name;
	float bal;
	float roi;
	float wdrw;
	float d;
	void create_acc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name");
		name=sc.nextLine();
		System.out.println("Enter customer address");
		add=sc.nextLine();
		System.out.println("Enter customer balance");
		bal=sc.nextFloat();
	}
	float display()
	{
		return bal;
	}
	void deposit(float d)
	{
		bal=bal+d;
		System.out.println("Your balance is:" +bal);
	}
	void withdraw(float wdrw)
	{
		if(bal>wdrw)
		{
			bal=bal-wdrw;
			System.out.println("Balance after withdrawing "+bal);
		}
		else
		{
			System.out.println("Balance is low");
		}
	}
	float rate(float roi)
	{
		bal=bal+(bal*(roi/100));
		return bal;
	}
}
class bank
{
	public static void main(String arg[])
	{
		Customer c=new Customer();
		int op;
		float bal;
		Scanner sc=new Scanner(System.in);
		boolean quit=false;
		do
		{
			System.out.println("Enter your choice \n 1.Create new account \n 2.Deposit\n 3.Interest\n4.Withdraw\n 5.Display balance\n 6.EXIT\n");
			op=sc.nextInt();
			switch(op)
			{
				case 1:
					System.out.println("Enter customer details");
					c.create_acc();
				break;

				case 2:
					System.out.println("Enter amount to deposit");
					float a=sc.nextFloat();
					c.deposit(a);
				break;
				case 3:
					System.out.println("Enter interest percentage");
					float r=sc.nextFloat();
					c.rate(r);
				break;
				case 4:
					System.out.println("Enter amount to withdraw");
					float w=sc.nextFloat();
					c.withdraw(w);
				break;
				case 5:
					bal=c.display();
					System.out.println("The current balance is "+bal);
				break;
				case 6:
					quit=true;
				break;
			}
		}while(op<=5);
	}
}