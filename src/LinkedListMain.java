/**
 *
 * @author Etem
 */
public class LinkedListMain {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        
        ll.addFirst(58);
        ll.addLast(4);
        ll.addLast(98);
        ll.addLast(102);
        ll.addLast(22);
        ll.addLast(88);
        ll.addLast(12);
        ll.deleteFirst();
        ll.deleteFirst();
        ll.deleteLast();
        ll.ShowAll();
    }
}
