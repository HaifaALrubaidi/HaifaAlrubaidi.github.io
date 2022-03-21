import java.util.Arrays;

/**
 * Created by MC on 20/03/2022.
 */
public class S3 {
    public static void main(String[] args) {

        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));

    }
    public void removeEntry (int [] array)
    {
        int i = 0;
        while ( i < array.length )
        {
            remove(array);
            i++;
            print(array);
        }
        System.out.println("The array is empty now.");
    }

    public void print (int [] array)
    {
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
            if (i != array.length-1)
                System.out.print(",");
            else
                break;
        }
        System.out.println("]");
    }
    public void remove (int [] array)
    {
        //int o = s.nextInt();
      //  if (index != array.length)
         //   remove(array,index);
      //  else
            System.out.println("not found");
    }

}