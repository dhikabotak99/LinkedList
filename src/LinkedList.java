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
        if (isEmpty()) {//Jika data kosong
            head=newNode;//Maka newNode masuk kedalam head
        }
        else{//jika data tidak kosong
            newNode.next=head;//Maka head masuk ke next newNode
            head=newNode;//dan newNode masuk ke head
        }
    }
    
//    Method untuk menambah data ke akhir
    public void addLast(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if (isEmpty()) {//Jika data kosong
            head=newNode;//Maka head di isi oleh newNode
        }
        else{//Jika data tidak kosong
            while(temp.next!=null){//Maka dilakukan perulangan selama
                                   //data di setelah data terakhir tidak kosong
                temp=temp.next;//maka data terakhir di isi oleh pointer data terakhir
            }
            temp.next=newNode;//newNode mengisi data ke pointer setelah data terakhir
        }
    }
    
//    Method untuk menghapus data yang ada di paling depan
    public void deleteFirst(){
        Node temp = head;
        if (!isEmpty()) {//Jika tidak kosong Maka dicek kemabli
            if (temp.next==null) {//Jika pointer di head menunjuk ke data kosong
                head=null;//Maka head itu kosong
            }
            else{//Jika Pointer yang menunjuk tidak kosong
                temp=temp.next;//Maka pointer yang menunjuk ke data kedua
                               //dimasukkan ke data pertama
                head=temp;//dan data pertama menjadi head
            }
        }
        else{//Jika kosong
            System.out.println("List Kosong"); //Maka muncul "List Kosong"
        }
    }
}
