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
    // int count = 0;
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
        // count++;
        
    }

    public void AddNodeInBeginning(int data){ //This is how wer add node at the beginning.
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

    public void AddNodeAtEnd(int data){ // This is how we add node at the end of a doubly linked list.
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
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
    
    public void displayReverse(){ // This is how we display node in a reverse order.
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
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
        Dlist.addElem(1);
        Dlist.addElem(2);
        Dlist.addElem(3);
        
       
       System.out.println("Original linkedList is : ");

       Dlist.display();

    //    System.out.println();

    //    System.out.println("New node added (60) at the beginning.");
    //    Dlist.AddNodeInBeginning(60);
    //    Dlist.display();

    //    System.out.println();  //creating a space between the lines

    //    System.out.println("New node added (90) at the end.");
    //    Dlist.AddNodeAtEnd(90);
    //    Dlist.display();
       
    //    System.out.println();
    //    System.out.println("Reverse order :");
    //    Dlist.displayReverse(); // print Linkedlist in a reverse order.
       
   }

    
}
