/**
 * Created by MC on 28/01/2022.
 */
public class ArrayStack_2<E> implements Stack<E>
{
    E T[];
    int t=-1;

    public ArrayStack_2(int c) {
        T=(E[])new Object[c];
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E element) {
        if(size()==T.length)
            throw new IllegalMonitorStateException("Stack is full");
        T[++t]=element;

    }

    @Override
    public E pop() {
        if(isEmpty())return null;
        E deleted=T[t];
        T[t]=null;
        t--;
        return deleted;

    }

    @Override
    public E top() {
        if(isEmpty())return null;
        return T[t];
    }
}
