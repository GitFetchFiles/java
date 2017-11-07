import java.util.*;
public class duplicate
{
	public static void main(String args[])
	{
		int n,i,temp,j,k=0,count;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of elements of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]= new int[n];
		System.out.println("Enter the elements of the array");
		for (i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for (i=0;i<n;i++) {
			count=0;
			temp=a[i];
			if (temp==a[i+1]) {
				count++;
			}
			if(count!=0)
				b[i]=temp;
		}
		System.out.println("The elements of array without duplicates are");
		for (i=0;i<n;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}