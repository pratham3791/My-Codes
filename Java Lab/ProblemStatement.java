import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.io.InputStream;
import java.lang.*;

class StudentInfo
{
    private String studentName = null;
    private int studentId = 1;

    void set_studentName(String name)
    {
        studentName = name;
    }

    String get_studentName()
    {
        return studentName;
    }

    void set_studentId(int n)
    {
        studentId = n;
    }

    int get_studentId()
    {
        return studentId;
    }
}

class StudentMarks extends StudentInfo
{
    private int marks1;
    private int marks2;
    private int marks3;

    void set_marks1(int n)
    {
        marks1 = n;
    }

    int get_marks1()
    {
        return marks1;
    }

    void set_marks2(int n)
    {
        marks2 = n;
    }

    int get_marks2()
    {
        return marks2;
    }

    void set_marks3(int n)
    {
        marks3 = n;
    }

    int get_marks3()
    {
        return marks3;
    }

}

class StudentResult extends StudentMarks
{
    private int totalMarks = 0;

    StudentResult(String name, int m1, int m2, int m3, int id)
    {
        set_studentName(name);
        set_marks1(m1);
        set_marks2(m2);
        set_marks3(m3);
        set_studentId(id);
        cal_totalMarks();
    }

    int get_totalMarks()
    {
        return totalMarks;
    }

    public void cal_totalMarks() 
    {
        this.totalMarks = get_marks1() + get_marks2() + get_marks3();
    }

    public void display()
    {
        System.out.println("Student " + get_studentId() + " : ");
        System.out.println("Name : " + get_studentName());
        System.out.println("Id : " + get_studentId());
        System.out.println("Marks 1 : " + get_marks1());
        System.out.println("Marks 2 : " + get_marks2());
        System.out.println("Marks 3 : " + get_marks3());
        System.out.println("Total Marks : " + get_totalMarks());
        System.out.println();
    }
}

public class ProblemStatement 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int size = 2;
        
        StudentResult[] sr = new StudentResult[size];

        String name = "";
        int m1, m2, m3;
        
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the name of student " + i+1 + " : ");
            name = scan.next();
            System.out.print("Enter the marks 1 : ");
            m1 = scan.nextInt();
            System.out.print("Enter the marks 2 : ");
            m2 = scan.nextInt();
            System.out.print("Enter the marks 3 : ");
            m3 = scan.nextInt();
            sr[i] = new StudentResult(name, m1, m2, m3, i+1);
            System.out.println();
        }

        for(int i = 0; i < size; i++)
        {
            sr[i].display();
        }
        
        int top_m = 0;
        String top_n = "";
        int top_id = 0;

        for(int i = 0; i < size; i++)
        {
            if(top_m < sr[i].get_totalMarks())
            {
                top_m = sr[i].get_totalMarks();
                top_n = sr[i].get_studentName();
                top_id = sr[i].get_studentId();
            }
        }

        System.out.println("Topper : " + top_n);
        System.out.println("Topper Id : " + top_id);
        System.out.println("Topper marks : " + top_m);
    }
}
