package DoublyLinkedList;

public class DLinkedList {  //This is how doubly LinkedList create and add data to the nodes.
   class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
    }
}

    Node head, tail = null;

    public void addElem(int data){ // This is how we add nodes to the doubly linked list.
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void AddNodeInBeginning(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            newNode.prev =  null;
            head = newNode;
        }
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
   


   public static void main(String[] args) {
        DLinkedList Dlist = new DLinkedList();
        Dlist.addElem(5);
        Dlist.addElem(6);
        Dlist.addElem(4);
        Dlist.addElem(2);
       
       System.out.println("Original linkedList is : ");

       Dlist.display();

       System.out.println();

       System.out.println("New node added at the beginning.");
       Dlist.AddNodeInBeginning(60);
       Dlist.display();
       
   }

    
}
