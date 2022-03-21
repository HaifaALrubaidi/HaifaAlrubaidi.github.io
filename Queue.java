/**
 * Created by MC on 20/02/2022.
 */
public interface Queue <E> {
    boolean isEmpty();
    int size();
    void enqueue(E element);
    E dequeue ();
    E first();
}