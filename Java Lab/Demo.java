//import java.util.Scanner;
/*
class TestDemo
{
	public void display()
	{
	// Widening
		// Coverting lower datatype to higher datatype
		int a = 1234567890;
		float b = a;
		
		System.out.println("\nWidening : ");
		System.out.println("int a : " + a);
		System.out.println("float b : " + b);

	// Naworring
		// Coverting lower datatype to higher datatype
		long c = 1234567890;
		//int d = c;		// loss occurs in data (implicit conversion)
		int d = (int)c;		// explicit conversion

		System.out.println("\nNarrowing : ");
		System.out.println("long c : " + c);
		System.out.println("int d : " + d);
	}
}
*/
class Demo
{
	public static void main(String args[])
	{
		int i, j;
/*		TestDemo td = new TestDemo();
  		td.display();
	
	// User Inputs
		Scanner sc = new Scanner(System.in);	

		// Input a line from a user

		System.out.print("Enter a line : ");
		String s = sc.nextLine();
		System.out.println("Input Line is : " + s);

		// Input a integer from user
		
		System.out.print("Enter a number : ");
		int i = sc.nextInt();
		System.out.println("Input Number is : " + i);

		// Input a char from user
	
		System.out.print("Enter a character : ");
		String ch = sc.next();
		System.out.println("Input Character is : " + ch);

	// Boxing
		// We have created an object of Integer class and assigned value of j to it

		int j = 10;		// primitive datatype
		//Integer obj1 = new Integer(j);		// object datatype
		Integer obj1 = j;

		System.out.println("j : " + j);
		System.out.println("obj1 : " + obj1);

	// Unboxing
		// We have created a variable and assigned value of Interger class object to it
		
		//Integer obj2 = new Integer(15);		// object datatype
		Integer obj2 = 15;
		int k = obj2;		// primitive datatype

		System.out.println("k : " + k);
		System.out.println("obj2 : " + obj2);
*/
		int[][] m = new int[2][4];

		System.out.print("Number of rows : " + m.length);
		System.out.print("Number of comlumn : " + m[0].length + "\n");

		for(i = 0; i < m.length; i++)
		{
			for(j = 0; j < m[i].length; j++)
			{
				System.out.print(" "+m[i][j]);
			}
			System.out.print("\n");
		}
	}
}