import java.util.Scanner;
import java.lang.*;

class LinkedList
{
    // creating head of the list   
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node (int d)
        {
            data = d;
            next = null;
        }
    }

    void display(LinkedList list)
    {
        if(list.head == null)
        {
            System.out.println("\nList is Empty...\n");
        }
        else
        {
            Node curr = list.head;
            while(curr != null)
            {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.print("\n");
        }
    }

    public void insert_at_end(int data, LinkedList list)
    {
        Node new_node = new Node(data);

        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int d, choice;
        
        System.out.println("1. Insert in list \n2. Display List \n3. Exit");

        while(true)
        {
            System.out.print("\nEnter the chocie : ");
            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                        System.out.print("Enter the data to insert in the list : ");
                        d = scan.nextInt();

                        list.insert_at_end(d, list);
                        break;
                
                case 2:
                        System.out.print("List : ");
                        list.display(list);
                        break;
                
                case 3:
                        System.exit(0);
                        break;
                
                default:
                        System.out.print("\nRe-enter the chocie...\n");
                        break;
            }
        }
    }
}
