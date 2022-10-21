import java.util.Scanner;

class Mul_LinkedList
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

    void display(Mul_LinkedList list)
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

    public void insert_at_end(int data, Mul_LinkedList list)
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

    public Node multiplyLL(Node head1, Node head2) {
        // Write your code here
        int sum1 = 0, sum2 = 0;
        
        while(head1 != null)
        {
            if(head1.data == -1)
            {
                break;
            }
            sum1 = sum1 * 10 + head1.data;
            head1 = head1.next;
        }
        //System.out.println("sum1 : " + sum1);
        while(head2 != null)
        {
            if(head2.data == -1)
            {
                break;
            }
            sum2 = sum2 * 10 + head2.data;
            head2 = head2.next;
        }
        //System.out.println("sum2 : " + sum2);
       
        int mul = sum1 * sum2;
        //System.out.println("mul : " + mul);
        
        Node temp = new Node(-1);
        Node new_node = new Node(-1);

        while(mul != 0)
        {
            new_node = new Node(mul%10);
            new_node.next = temp;
            temp = new_node;
            mul = mul / 10;
        }
        return new_node;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mul_LinkedList list1 = new Mul_LinkedList();
        Mul_LinkedList list2 = new Mul_LinkedList();

        int i, d, size = 4;
        System.out.println("Enter the elements for list 1 : ");
        for(i = 0; i < size; i++)
        {
            d = scan.nextInt();
            list1.insert_at_end(d, list1);
        }
        System.out.println("Enter the elements for list 2 : ");
        for(i = 0; i < size; i++)
        {
            d = scan.nextInt();
            list2.insert_at_end(d, list2);
        }

        Mul_LinkedList fin = new Mul_LinkedList();
        Node head1 = list1.head;
        Node head2 = list2.head;
        Node head_fin = fin.multiplyLL(head1, head2);

        System.out.println("Head fin : ");
        while(head_fin != null)
        {
            System.out.print(" " + head_fin.data);
            head_fin = head_fin.next;
        }

    }
}

