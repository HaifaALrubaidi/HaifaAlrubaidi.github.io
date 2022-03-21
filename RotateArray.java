import java.util.Arrays;

/**
 * Created by MC on 16/01/2022.
 */
public class RotateArray
{
    public static void main(String[] args) {

        int a[]={11,12,13,14,15};
//        System.out.println(Arrays.toString(a));
//        System.out.println("After reverse");
//        System.out.println(Arrays.toString(shiftleft(a)));
        System.out.println(Arrays.toString(a));
        System.out.println("After shift Right");
        System.out.println(Arrays.toString(shifRight(a)));
    }
    public static int[]shiftleft(int[]x)
    {
        int t=x[0];
        for (int i = 0; i <x.length-1 ; i++) {
            x[i]=x[i+1];
        }
        x[x.length-1]=t;
        return x;
    }
    public static int[]shifRight(int[]y)
    {
        int t=y[y.length-1];
        for (int i = y.length-1; i >0 ; i--) {
            y[i]=y[i-1];
        }
        y[0]=t;
        return y;
    }

}
