import java.util.Scanner;

class Employee{
    // variables or members
    String first_name = new String();
    String last_name = new String();
    float salary = new Float(0.0);

    // default consturctor
    Employee()
    {
        first_name = "NULL";
        last_name = "NULL";
        salary = 0.0f;
    }

    // Parameterized Constructor
    Employee(String fn, String ln, float s)
    {
        first_name = fn;
        last_name = ln;
        salary = s;
    }

    // methods
    void display()
    {
        System.out.println("First Name : " + first_name);
        System.out.println("Last Name : " + last_name);
        System.out.println("Salary : " + salary);
    }

    void input()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the first name : ");
        first_name = scan.nextLine();
        System.out.print("Enter the last name : ");
        last_name = scan.nextLine();
        System.out.print("Enter the monthly salary : ");
        salary = scan.nextInt();
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Default constructor called for a new object created o class Employee
        Employee e = new Employee();
        e.display();

        // local variables
        String fn, ln;
        float s;

        // User defined values
        // Parameterized constructor called 
        System.out.print("\nEnter the first name : ");
        fn = scan.nextLine();
        System.out.print("Enter the last name : ");
        ln = scan.nextLine();
        System.out.print("Enter the monthly salary : ");
        s = scan.nextInt();

        // setting the salary value to 0.0 if user enters it negative
        if(s < 0)
        {
            s = 0.0f;
        }
        
        Employee e1 = new Employee(fn, ln, s);
        e1.display();
        
        Employee e2 = new Employee();
        e2.input();
        e2.display();

        System.out.println("\nThe Yearly salary of the Employee " + e1.first_name + " is : " + (e1.salary * 12));
        System.out.println("The Yearly salary of the Employee " + e2.first_name + " is : " + (e2.salary * 12));

        System.out.println("\nThe salary of the employees is increased by 10%...");
        System.out.println("The new salaries are : ");
        System.out.println(e1.first_name + " : " + (e1.salary + (e1.salary * 0.1)));
        System.out.println(e2.first_name + " : " + (e2.salary + (e2.salary * 0.1)));

        System.out.println("\nThe updaeted yearly salaries of the employees are : ");
        System.out.println("The Yearly salary of the Employee " + e1.first_name + " is : " + (e1.salary * 12));
        System.out.println("The Yearly salary of the Employee " + e2.first_name + " is : " + (e2.salary * 12));
        System.out.println();
    }
}
