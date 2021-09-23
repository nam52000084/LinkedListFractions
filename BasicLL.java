import java.lang.*;
public class BasicLL <E> implements ListI <E>
{
    private ListNode <E> pHead = null;
    private ListNode <E> pTail = null;
    private int numNodes=0;


    @Override
    //Add first
    public void addFirst(E item)
    {
        ListNode <E> node1 = new ListNode<>(item);
        node1.pNext=pHead;
        pHead=node1;
    }

    //Add after
    public void addAfter(E item, E current)
    {
        //Tao node2 chua gia tri Item
        ListNode <E> node2 = new ListNode<>(item);
        //Khoi tao bien tam Temp
        ListNode <E> temp=pHead;
        //Duyet den phan tu dung truoc phan tu addAfter
        while(temp.element!=current)
        {
            temp = temp.pNext;
        }
        //addAfter
        node2.pNext=temp.pNext;
        temp.pNext=node2;

    }
    //TO STRING
    public void print()
    {
        System.out.println("List: ");
        ListNode <E> temp=pHead;
        while(temp.pNext!=null)
        {
            System.out.println(temp.element);
        }
    }


}
