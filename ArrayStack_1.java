/**
 * Created by MC on 28/01/2022.
 */
public class ArrayStack_1<E> implements Stack<E>
{
    E S[];
    int t=-1;

    public ArrayStack_1(int c) {
        S=(E[])new Object[c];
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
        if(size()==S.length)
            throw new IllegalMonitorStateException("Stack is full");
        S[++t]=element;

    }

    @Override
    public E pop() {
        if(isEmpty())return null;
          E deleted=S[t];
        S[t]=null;
        t--;
        return deleted;

    }

    @Override
    public E top() {
        if(isEmpty())return null;
        return S[t];
    }
}
