import java.util.*;
class mat2
{
	public static void main(String args[])
	{
		int i;
		operations o=new operations();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your choice\n");
		System.out.println("1.Addition \n2.Multiplication\n");
		i=sc.nextInt();
		switch(i)
		{
			case 1:System.out.println("The addition of matrix is :\n");
			o.add();
			break;
			case 2:System.out.println("The multiplication is :\n");
			o.multiply();
			break;
			default:System.out.println("Invalid choice\n");
		}

	}
}
class operations
{
	void add()
	{
		int i, j;
		int mat1[][] = new int[3][3];
		int mat2[][] = new int[3][3];
		int mat3[][] = new int[3][3];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Matrix 1 Elements : ");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				mat1[i][j] = scan.nextInt();
			}
		}
		System.out.print("Enter Matrix 2 Elements : ");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				mat2[i][j] = scan.nextInt();
			}
		}
		System.out.print("Adding both Matrix to form the Third Matrix...\n");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.print("The Two Matrix Added Successfully..!!\n");
		System.out.print("The New Matrix will be :\n");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(mat3[i][j]+ " ");
			}
			System.out.println();
		}
	}
	void multiply()
	{
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base of squared matrices");
		n = input.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] c = new int[n][n];
		System.out.println("Enter the elements of 1st martix row wise \n");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd martix row wise \n");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				b[i][j] = input.nextInt();
			}
		}
		System.out.println("Multiplying the matrices...");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}			
		System.out.println("The product is:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}