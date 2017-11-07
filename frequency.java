import java.util.*;
public class frequency
{
	public static void main(String args[])
	{
		int n,count,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements of the array");
		n=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int a[]=new int[n];
		for (i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for (i=0;i<n;i++)
		{	count=0;
			for(j=0;j<n;j++)
			{
				if (a[i]==a[j]) {
					count++;
				}
			}
			System.out.println("The frequency of "+a[i]+" is "+count);
		}
	}
}