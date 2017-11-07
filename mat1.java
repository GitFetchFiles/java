import java.util.*;
class mat1
{
	public static void main(String args[])
	{
		int i;
		operations o=new operations();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your choice\n");
		System.out.println("1.Addition \n2.Transpose\n");
		i=sc.nextInt();
		switch(i)
		{
			case 1:System.out.println("The addition of matrix is :\n");
			o.add();
			break;
			case 2:System.out.println("The trannspose is :\n");
			o.trans();
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
	void trans()
	{
		int i, j;
		System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter matrix:");
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < column; j++)
			{
				array[i][j] = s.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("The above matrix before Transpose is ");
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < column; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("The above matrix after Transpose is ");
		for(i = 0; i < column; i++)
		{
			for(j = 0; j < row; j++)
			{
				System.out.print(array[j][i]+" ");
			}
			System.out.println(" ");
		}
	}
}