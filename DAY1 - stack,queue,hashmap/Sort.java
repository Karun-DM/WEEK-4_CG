import java.util.*;
public class Sort {
    public static void main(String[] args) {
        Stack<Integer> original=new Stack<>();
        original.push(20);
        original.push(23);
        original.push(12);
        original.push(89);
        System.out.println(original);
        Stack<Integer> sorted = sortStack(original);
        System.out.println(sorted);


    }
    public static Stack<Integer> sortStack(Stack<Integer> input){
        Stack<Integer> temp=new Stack<>();
        while(!input.isEmpty()){
            int current=input.pop();
            while (!temp.isEmpty()&&temp.peek()>current) {
                input.push(temp.pop());              
            }
            temp.push(current);
        }
        return temp;
    }
}
