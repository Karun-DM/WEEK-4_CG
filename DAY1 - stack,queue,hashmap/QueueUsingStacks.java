import java.util.*;

public class QueueUsingStacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();  
        Stack<Integer> stack2 = new Stack<>(); 
 
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

  
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.isEmpty()) {
            System.out.println("Dequeued: " + stack2.pop());
        }

  
        stack1.push(40);

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.isEmpty()) {
            System.out.println("Dequeued: " + stack2.pop());
        }
    }
}

