import java.util.Scanner;

/**
 * Created by MC on 23/01/2022.
 */
public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<Integer>mystack=new ArrayStack<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("Is the Stack empty? "+mystack.isEmpty());
        System.out.println("Input elements");
        for (int i = 0; i <5 ; i++)
        {
            mystack.push(in.nextInt());
            System.out.println("top element is=  "+mystack.top());
            System.out.println("size of stack is  "+mystack.size());
            System.out.println("is the stack empty "+mystack.isEmpty());
        }
        for (int i = 0; i <6 ; i++)
        {
            System.out.println("deleted element  "+mystack.pop());
            System.out.println("top element after delete=  "+mystack.top());
            System.out.println("size of stack is  "+mystack.size());
            System.out.println("is the stack empty "+mystack.isEmpty());
        }
    }
}
