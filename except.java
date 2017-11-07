import java.util.*;
class except
{
public static void main( String args[])
{
int n,i,sum=0;
Scanner sc=new Scanner(System .in);
System.out.println("Enter the number of elements");
n=sc.nextInt();
int a[ ]= new int[n];
try
{
	System.out.println("Enter the number");
for(i=0;i<n;i++)
{

a[i]=sc.nextInt();
if(a[i]<0)
{
throw new NumberFormatException();
}
sum+= a[i];
}
System.out.println("Sum of no is"+ sum);
}
catch(NumberFormatException ne)
{
System.out.println("Entered no. is negative");
}
}
}