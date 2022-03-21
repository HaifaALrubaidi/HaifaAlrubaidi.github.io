import java.util.Scanner;

/**
 * Created by MC on 20/02/2022.
 */
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      Circularlylinkedlist<String>list=new Circularlylinkedlist<>();
        System.out.println("1. add frist \t 2. add last \t 3.remove frist \t 4.rotate \t 0. exit");
        int choice=-1;

        while (choice!=0)
        {
            System.out.print("your choice");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input elemnt:");
                    list.addfirst(in.next());
                    System.out.println("Frist element = " +list.first()+"\t last element ="+list.last()
                    +"\t size ="+list.size());
break;
                case 2:
                    System.out.println("input element:");
                    list.addlast(in.next());
                    System.out.println("Frist element = " +list.first()+"\t last element ="+list.last()
                            +"\t size ="+list.size());
                    break;
                case 3:
                    System.out.println("removed element is ="+list.remove());
                    System.out.println("Frist element = " +list.first()+"\t last element ="+list.last()
                            +"\t size ="+list.size());
                    break;
                case 4:
                    list.rotate();
                    System.out.println("after rotate first element ="+list.first()+"\t last element ="+list.last()
                            +"\t size ="+list.size()+"\n \n");
                    break;

                case 0:
                    System.exit(0);
            }

        }
    }
}
