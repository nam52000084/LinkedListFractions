import java.util.List;

public class ListNode <E>
{
    public E element;
    public ListNode <E> pNext;

    //Constructors
    public ListNode (E item)
    {
        this.element=item;
        this.pNext=null;
    }

    public ListNode(E item, ListNode <E> n)
    {
        this.element=item;
        this.pNext=n;
    }

    //Get next
    public ListNode<E> getNext() {
        return pNext;
    }

    //Get element
    public E getElement() {
        return element;
    }

    //Set next
    public void setNext(ListNode<E> next) {
        this.pNext = next;
    }
}
