import java.util.Arrays;

/**
 * Created by MC on 13/03/2022.
 */
public class S2 {
    public static void main(String[] args) {

        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("The element of second array");
        copy(a);
    }

    public static void copy (int [] y)
    {
        int []x;
        x = new int [y.length];
        for (int i = 0; i <y.length ; i++) {
            x[i] = y[i];
        }
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);
        }
    }

}
