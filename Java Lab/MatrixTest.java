// transpose
// vector multiplication
// scalar multiplication
// heap memory objects are created 

import java.util.Scanner;
//import java.lang.*;

class Matrix
{
	void display(int[][] m1)
	{
		int i, j;
		System.out.println("\nMatrix : ");
		for(i = 0; i < m1.length; i++)
		{
			for(j = 0; j < m1[i].length; j++)	
			{
				System.out.print(" " + m1[i][j]);
			}
			System.out.print("\n");
		}
	}

	int[][] input(int r, int c)
	{
		Scanner scan = new Scanner(System.in);
		int[][] m = new int[r][c];
		
		int i, j;

		System.out.println("Enter the elements of matrix : ");
		for(i = 0; i < m.length; i++)
		{
			for(j = 0; j < m[i].length; j++)	
			{
				System.out.print("Enter the element mat["+i+"]["+j+"] : ");
				m[i][j] = scan.nextInt();
			}
		}
		return m;
	}

	int[][] addition(int[][] m1, int[][] m2)
	{
		int[][] m3 = new int[m1.length][m1[0].length];
		int i, j;

		for(i = 0; i < m1.length; i++)
		{
			for(j = 0; j < m1[i].length; j++)	
			{
				m3[i][j] = m1[i][j] + m2[i][j];
			}
			System.out.print("\n");
		}
		return m3;
	}

	int[][] subtraction(int[][] m1, int[][] m2)
	{
		int[][] m3 = new int[m1.length][m1[0].length];
		int i, j;

		for(i = 0; i < m1.length; i++)
		{
			for(j = 0; j < m1[i].length; j++)	
			{
				m3[i][j] = m1[i][j] - m2[i][j];
			}
			System.out.print("\n");
		}
		return m3;
	}

	int[][] multiplication(int[][] m1, int[][] m2)
	{
		int[][] m3 = new int[m1.length][m1[0].length];
		int i, j, k, sum = 0;

		for(i = 0; i < m1.length; i++)
		{
			for(j = 0; j < m1[i].length; j++)	
			{
				sum = 0;
				for(k = 0; k < m1[i].length; k++)
				{
					sum += m1[i][k] * m2[k][j];	
				}
				m3[i][j] = sum;
			}	
		}
		return m3;
	}

	int[][] division(int[][] m1, int[][] m2)
	{
		int[][] m3 = new int[m1.length][m1[0].length];
		int i, j;

		for(i = 0; i < m1.length; i++)
		{
			for(j = 0; j < m1[i].length; j++)	
			{
				m3[i][j] = m1[i][j] / m2[i][j];
			}
			System.out.print("\n");
		}
		return m3;
	}

	int[][] transpose(int[][] m1)
	{
		int[][] m = new int[m1.length][m1[0].length];
		int i, j;
		for(i = 0; i < m1.length; i++)
		{
			for(j = 0; j < m1[i].length; j++)	
			{
				m[i][j] = m1[j][i];		
			}
		}
		return m;
	}

	int[][] scalar_multiplication(int[][] m1, int n)
	{
		int[][] m = new int[m1.length][m1[0].length];
		int i, j;
		for(i = 0; i < m1.length; i++)
		{
			for(j = 0; j < m1[i].length; j++)	
			{
				m[i][j] = m1[i][j] * n;		
			}
		}
		return m;
	}

	int[][] vector_multiplication(int[][] m1, int[][] m2)
	{
		int[][] m = new int[m2.length][m2[0].length];
		int i, j, k, sum = 0;

		for(i = 0, k = 0; i < m1.length; i++)
		{
			sum = 0;			
			for(j = 0; j < m2.length; j++)	
			{
				sum += m1[i][j] * m2[j][k];		
			}
			m[i][k] = sum;
			if(k == m2[i].length)
			{
				k++;
			}
		}
		return m;
	}
}

class Expt_02_matrix
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Matrix m = new Matrix();

		int rows, columns;

		// Input the matrix 1
	
		// Input the rows and columns for the matrix 
		System.out.print("Enter the number of rows for the matrix 1 : ");
		rows = scan.nextInt();

		System.out.print("Enter the number of columns for the matrix 1 : ");
		columns = scan.nextInt();

		int[][] matrix1 = new int[rows][columns];
		int[][] matrix2 = new int[rows][columns];
		int[][] matrix3 = new int[rows][columns];

		// Input the elements for the matrices
		System.out.println("Enter the elements for the matrix 1 : ");
		matrix1 = m.input(rows, columns);

		System.out.println("Enter the elements for the matrix 1 : ");
		matrix2 = m.input(rows, columns);
	
	// Menu
		System.out.println("\n1 . Addition \n2 . Subtraction \n3 . Multiplication \n4 . Division \n5 . Transpose \n6 . Display Matrices \n7 . Scalar Multiplication with a number \n8 . Vector Multiplication \n9 . Exit \n");

		while(true)
		{		
			System.out.println("Enter your choice : ");
			int choice = scan.nextInt();

			switch(choice)
			{
				case 1:
				// Addition of the matrices
					System.out.print("\nAfter adding the matrix1 and matrix2 : ");
 					matrix3 = m.addition(matrix1, matrix2);
	
					m.display(matrix3);
					break;
		
				case 2:
				// Subtraction of the matrices
					System.out.print("\nAfter subtracting the matrix1 and matrix2 : ");
 					matrix3 = m.subtraction(matrix1, matrix2);
	
					m.display(matrix3);
					break;
			
				case 3:
				// Multiplication of the matrices
					System.out.print("\nAfter multiplicating the matrix1 and matrix2 : ");
 					matrix3 = m.multiplication(matrix1, matrix2);
	
					m.display(matrix3);
					break;

				case 4:
				// Division of the matrices
					System.out.print("\nAfter dividing the matrix1 and matrix2 : ");
 					matrix3 = m.division(matrix1, matrix2);
	
					m.display(matrix3);
					break;

				case 5:
				// Transpose of the matrix
					System.out.print("\nTranspose of matrix1 : ");
 					matrix3 = m.transpose(matrix1);
	
					m.display(matrix3);
					break;

				case 6:
				// Display matrix
					System.out.print("\nMatrix 1 : ");	
					m.display(matrix1);

					System.out.print("\nMatrix 2 : ");	
					m.display(matrix2);
					break;

				case 7:
				// Scalar multiplication of matrix
					System.out.print("Enter the number to multiply : ");
					int num = scan.nextInt();
					System.out.print("\nAfter multiplicating the matrix1 by " + num + " : ");
 					matrix3 = m.scalar_multiplication(matrix1, num);
	
					m.display(matrix3);
					break;

				case 8:
				// Vector multiplication of matrices
					System.out.print("Enter the number of rows for the matrix 1 : ");
					rows = scan.nextInt();

					System.out.print("Enter the number of columns for the matrix 1 : ");
					columns = scan.nextInt();

					System.out.println("Enter the elements for the matrix1 : ");
					matrix1 = m.input(rows, columns);

					System.out.print("Enter the number of rows for the matrix 2 : ");
					rows = scan.nextInt();

					System.out.print("Enter the number of columns for the matrix 2 : ");
					columns = scan.nextInt();

					System.out.println("Enter the elements for the matrix2 : ");
					matrix2 = m.input(rows, columns);

					matrix3 = m.vector_multiplication(matrix1, matrix2);

					m.display(matrix3);
					break;

				case 9:	
				// Exiting call
					System.exit(0);
					break;
	
				default:
					System.out.println("\nRe-enter a valid choice\n");
					break;
			}
		}
	}
}