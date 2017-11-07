import java.util.*;
public class diagonal
{
	public static void main(String args[])
	{
		int n,i,j,b=0,c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n for n*n matrix");
		n=sc.nextInt();
		int a[][]= new int[n][n];
		System.out.println("Enter the elements of the matrix");
		for (i=0;i<n;i++)
		{
			for (j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
            if(j>i)
                b+=a[i][j];
            else
                if(i>j)
                    c+=a[i][j];
		System.out.println("The sum of elements above diagonal is"+b);
		System.out.println("The sum of elements below diagonal is"+c);
	}
}