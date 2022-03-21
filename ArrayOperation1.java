import java.util.Arrays;
/**
 * Created by MC on 16/01/2022.
 */
public class ArrayOperation1
{
    public static void main(String[] args)
    {
      int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("After reverse");
        System.out.println(Arrays.toString(revevse(a)));

    }
    public static int []revevse (int []x)
    {
        int n=x.length-1;
        for (int i = 0; i <x.length/2 ; i++) {
           int t =x[i];
            x[i]=x[n];
            x[n]=t;
            n--;
        }
        return x;
    }
}
