import java.util.Scanner;
import java.util.Vector;
import java.lang.*;

public class Stack {
    public static void push(int data, Vector<Integer> stack, int top)
    {
        stack.add(data);
    }
    
    public static int pop(Vector<Integer> stack, int top)
    {
        return stack.remove(top);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Vector<Integer> stack = new Vector<>();
        int top = -1;
        int choice, data;

        System.out.println(" 1. Push in Stack \n 2. Pop from Stack \n 3. Display stack \n 4. Peek \n 5. Exit");
        while(true)
        {
            System.out.print("Enter your choice : ");
            choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the data to enter in Stack : ");
                    data = scan.nextInt();

                    Stack.push(data, stack, top);
                    top++;
                    break;
            
                case 2:
                    if(top == -1)
                    {
                        System.out.println("Stack Underflow");
                        break;
                    }

                    System.out.println("Popped element : " + Stack.pop(stack, top));
                    top--;
                    break;

                case 3:
                    if(top == -1)
                    {
                        System.out.println("Stack is Empty...");
                        break;
                    }

                    System.out.println("Stack : ");
                    for(int i: stack)
                    {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                
                case 4:
                    if(top == -1)
                    {
                        System.out.println("Stack is Empty...");
                        break;
                    }

                    System.out.println("Top of Stack : " + stack.get(top));
                    break;
                
                case 5:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Enter a correct option...");
                    break;
            }
        }
    }
}
