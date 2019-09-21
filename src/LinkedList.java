/**
 *
 * @author Etem
 */
public class LinkedList {
//    Deklarasi Variabel
    Node head;
    
//    Method untuk menampilkan data
    public void ShowAll(){
        Node temp;
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
