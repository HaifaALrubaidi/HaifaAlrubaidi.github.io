import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by MC on 30/01/2022.
 */
public class PrintFileInConsole {
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayQueue<String>q=new ArrayQueue<>(3);
        //D:\
        Scanner in=new Scanner(System.in);
        System.out.println("Enter file names with path to print ");
        for (int i = 0; i <3 ; i++) {
            q.enqueue(in.next());
        }
        while (!q.isEmpty()){
            //System.out.println(q.dequeue());
            Scanner fs =new Scanner(new File(q.dequeue()));
            while (fs.hasNextLine()) {
                System.out.println(fs.nextLine());
            }
        }

    }
}
