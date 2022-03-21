import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MC on 30/01/2022.
 */
public class Test {
    public static void main(String[] args) {
        ArrayQueue<Character>Q=new ArrayQueue<>(5);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Queue element");
        for (int i = 0; i <5 ; i++) {
           Q.enqueue(in.next().charAt(0));
            System.out.println(" first  "+Q.first());
            System.out.println("size ="+Q.size());
        }
        System.out.println("all element are");
       while (!Q.isEmpty())
           System.out.print(Q.dequeue()+"\t");
    }
}
