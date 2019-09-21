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
    
//    Method untuk menambah data ke awal
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (isEmpty()) {//Jika kosong
            head=newNode;//Maka newNode masuk kedalam head
        }
        else{//jika tidak kosong
            newNode.next=head;//Maka head masuk ke next newNode
            head=newNode;//dan newNode masuk ke head
        }
    }
}
