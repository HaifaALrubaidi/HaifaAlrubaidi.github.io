/**
 * Created by MC on 20/02/2022.
 */
public class Singlelinkqueue<E>implements Queue<E> {
    SingleLinkedList<E> l =new SingleLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return l. isEmpty();
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public void enqueue(E e) {
 l.addlast(e);
    }

    @Override
    public E dequeue() {
        return l.removefrist();
    }

    @Override
    public E first() {
        return l.first();
    }
}
