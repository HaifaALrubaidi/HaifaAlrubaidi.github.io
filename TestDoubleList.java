import java.util.Scanner;

/**
 * Created by MC on 20/03/2022.
 */
public class TestDoubleList {
    public static void main(String[] args) {
        DoublyLinkedList<String>list=new DoublyLinkedList<>();
        Scanner in=new Scanner(System.in);
            System.out.println("1. add frist \t 2. add last \t 3.remove frist \t 4.remove last \t 0. exit");
            int choice=-1;

            while (choice!=0)
            {
                System.out.print("your choice");
                choice=in.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("input elemnt:");
                        list.addfirst(in.next());
                        break;
                    case 2:
                        System.out.println("input element:");
                        list.addlast(in.next());
                        break;
                    case 3:
                        System.out.println("deleted is ="+list.removefirst());
                        break;
                    case 4:
                        System.out.println("deleted is ="+list.removelast());
                        break;

                    case 0:
                        System.exit(0);
                }

            }
        }
    }

