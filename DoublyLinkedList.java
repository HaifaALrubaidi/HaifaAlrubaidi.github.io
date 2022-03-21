/**
 * Created by MC on 20/03/2022.
 */
public class DoublyLinkedList<E> {
    private static class Node<E>{
        private E element;
        Node<E>prev;
        Node<E>next;

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;

        }
    }
   private Node<E>header=null;
    private Node<E>trailer=null;
    private int size=0;

    public DoublyLinkedList() {
        header=new Node<E>(null,null,null);
        trailer=new Node<E>(null,header,null);
        header.setNext(trailer);
    }
    public boolean isEmty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E fist(){
        if(isEmty())return null;
        return header.getNext().getElement();
    }
    public E last(){
        if(isEmty())return null;
        return trailer.getPrev().getElement();
    }
    private void addBetween(E element,Node<E>p,Node<E>n){
        Node<E>newst=new Node<E>(element,p,n);
        p.setNext(newst);
        n.setPrev(newst);
        size++;
    }
    public void addfirst(E element){
        addBetween(element,header,header.getNext());
    }
    public void addlast(E element){
        addBetween(element,trailer.getPrev(),trailer);
    }
    private E remove(Node<E>x){
        Node<E>p=x.getPrev();
        Node<E>n=x.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return x.getElement();
    }
    public E removefirst()
    {
        if(isEmty())return null;
       return remove(header.getNext());
    }
    public E removelast()
    {
        if(isEmty())return null;
      return   remove(trailer.getPrev());
    }
}
