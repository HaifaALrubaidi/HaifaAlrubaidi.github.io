/**
 * Created by MC on 19/02/2022.
 */
public class Test
{
    public static void main(String[] args) {
        SingleLinkedList<String>list=new SingleLinkedList<>();
        System.out.println(list.size);
        list.addfirst("Haifa");
        list.addlast("Safa");
        System.out.println(list.size);
        System.out.println(list.first());
        System.out.println(list.last());
        while (!list.isEmpty())
            list.removefrist();
        System.out.println(list.size);
    }
}
