/**
 * Created by MC on 20/02/2022.
 */
public class SinglelinkeStack<E>implements Stack<E> {
SingleLinkedList<E> l =new SingleLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public void push(E e) {
l.addfirst(e);
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E top() {
        return null;
    }
}
