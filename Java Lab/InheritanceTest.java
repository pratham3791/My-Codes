//import java.util.*;

class Person
{
    String name;
    String birthdate;
    int height;
    int weight;
    String address;
    int claculateAge()
    {
        return 0;
    }

    Person()
    {
        System.out.println("This is the Person constructor");
    }

    void display()
    {
        System.out.println("This is the Person class");
    }
}

class Student extends Person
{
    int rollno;
    int marks;
    int calculateAvg()
    {
        return 0;
    }

    Student()
    {
        System.out.println("This is the Student constructor");
    }

    void display()
    {
        System.out.println("This is the Student class");
    }
}

class Employee extends Person
{
    int empid;
    int salary;
    int calculateTax()
    {
        return 0;
    }

    Employee()
    {
        System.out.println("This is the Employee constructor");
    }

    void display()
    {
        System.out.println("This is the Employee class");
    }
}

class InheritanceTest 
{
    public static void main(String[] args) 
    {
        //Scanner scan = new Scanner(System.in);

        Person p = new Person();
        Student s = new Student();
        Employee e = new Employee();

        p.display();
        s.display();
        e.display();
    }
}
