/**
 * Created by MC on 13/03/2022.
 */
public class R3_6<E> {
    private Node <E> head = null;
    private Node <E> tail = null;
    private int size = 0;

    public R3_6() {
    }

    public boolean isEmpty (){
        return size == 0;
    }

    public int getSize (){
        return size;
    }

    public E first (){
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last (){
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst (E ex){
        head = new Node<E>(ex,head);
        if (isEmpty())
            tail = head;
        size++;
    }

    public void addLast (E ex){
        Node <E> newest = new Node<E>(ex,null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst ()
    {
        if (isEmpty())
            return null;
        E deletedElement = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty())
            tail = null;
        return deletedElement;
    }

    public String print ()
    {
        Node <E> i = head;
        String all = "";
        while (i!=null)
        {
            all = all + i.getElement().toString() + "\n";
            i = i.getNext();
        }
        return all;
    }

    public void findSecondToLast ()
    {
        if (isEmpty())
            System.out.println("No Elements.");
        else
        {
            Node <E> pointer = head.getNext();
            while (pointer.getNext() != null)
            {
                System.out.println(pointer.getElement());
                pointer = pointer.getNext();
            }
            System.out.println(pointer.getElement());
        }
    }

    public void rotate (E e)
    {
        addLast(e);
        if (size > 1)
            removeFirst();
    }

    public Node<E> getHead() {
        return head;
    }

    public boolean equals (R3_6 x , R3_6 y)
    {
        boolean f = false;
        int count = 0;
        Node <E> p1 = x.getHead();
        Node <E> p2 = y.getHead();
        if (x.isEmpty() && y.isEmpty())
            return true;
        else
        {
            if ( x.getSize() != y.getSize() )
                return false;
            else
            {

            }
        }
        return f;
    }

    private static class Node <E> {
        private E element ;
        private Node <E> next ;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
            R3_6 <Integer> x = new R3_6<>();
            x.addLast(1);
            x.addLast(2);
            x.addLast(3);
            x.addLast(4);
            x.findSecondToLast();
            x.rotate(5);
            System.out.println("---------------------");
            x.findSecondToLast();
        }
    }

