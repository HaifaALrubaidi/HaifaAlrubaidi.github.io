import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperation2
{
   int x[];
    int numofElments;

    public ArrayOperation2()
    {
    x=new int[5];
        numofElments=0;
    }
    public int addElement(int e)
    {
        if(numofElments<x.length)
        {
            x[numofElments]=e;
            numofElments++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayOperation2 test=new ArrayOperation2();
        Scanner in=new Scanner(System.in);
        System.out.println("input elements");
        for (int i = 0; i < 7; i++) {
            if (test.addElement(in.nextInt()) == 0)
                System.out.println("added sucessfully");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }

        }
    }


