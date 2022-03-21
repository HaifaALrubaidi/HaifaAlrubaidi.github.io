import java.util.Arrays;

/**
 * Created by MC on 13/03/2022.
 */
public class S1 {
    public static void main(String[] args) {

        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("After reverse");
       reverse(a);
    }
    public static void reverse (int [] x)
    {
        int [] y = new int [x.length];
        for (int i = 0; i <x.length ; i++) {
            y[i] = x[x.length-1-i];
        }

        for (int i = 0; i <x.length ; i++) {
            x[i] = y[i];
            System.out.println(x[i]);
        }

    }


}
