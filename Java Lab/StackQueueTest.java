import java.util.*;

// STACK INTERFACE

interface StackInterface
{
    int push(int data);
    int pop();
    void display();
}

class Stack implements StackInterface
{
    int[] stack = new int[5];
    int top = -1;

    public int push(int data)
    {
        if(top + 1 == 5)
        {
            return -1;
        }
        stack[++top] = data;
        return 0;
    }

    public int pop()
    {
        if(top == 0)
        {
            top = -1;
            return -1;
        }
        int n = stack[top];
        stack[top] = 0;
        top--;
        return n;
    }

    public void display()
    {
        if(top == -1)
        {
            System.out.println("Stack Empty");
        }
        else
        {
            System.out.print("Stack : ");;
            for(int i = 0; i <= top; i++)
            {
                System.out.print(" " + stack[i]);
            }
            System.out.println();
        }
    }
}

// QUEUE INTERFACE

interface QueueInterface
{
    int enqueue(int data);
    int dequeue();
    void display();
}

class Queue implements QueueInterface
{
    int[] queue = new int[5];   
    int front = -1, rear = 0;

    public int enqueue(int data)
    {
        if(rear == 4)
        {
            return -1;
        }
        if(front == -1)
        {
            front = 0;
        }
        queue[rear++] = data;
        return 0;
    }

    public int dequeue()
    {
        if(front == -1)
        {
            return -1;
        }
        int n = queue[front];
        for(int i = front; i < rear; i++)
        {
            queue[i] = queue[i+1];
        }
        rear--;
        return n;
    }

    public void display()
    {
        if(front == -1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            System.err.print("\nQueue : ");
            for(int i = front; i <= rear; i++)
            {
                System.out.print(" "  + queue[i]);
            }
            System.err.println();
        }
    }
}

class StackQueueTest
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Stack implementation
        Stack s = new Stack();
        int choice, data, t;

        while(true)
        {
            System.out.print("Operations : \n 1. Push \n 2. Pop \n 3. Display \n 4. Exit \n");
            System.out.println("\nEnter your choice : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data to push to stack : ");
                    data = scan.nextInt();

                    t = s.push(data);
                    if(t != -1)
                    {
                        System.out.println("Data pushed successfully...!!");
                    }
                    else
                    {
                        System.out.println("Stack overflow");
                    }
                    break;
            
                case 2:
                    t = s.pop();
                    if(t != -1)
                    {
                        System.out.println("Data " + t + " popped successfully...!!");
                    }
                    else
                    {
                        System.out.println("Stack underflow");
                    }
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Re-Enter a valid choice!!");
                    break;
            }
        }

        // Queue implementation
        Queue q = new Queue();
    }
}
