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
    public int count = 0;
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

    public void AddNewNode(int data){ //This is to add a new node into the list.
        Node newNode = new Node(data);
        if (head == null){
            addElem(data);
        }
        else{
            AddNodeAtEnd(data);
        }
        count++;
    }

    public void addNodeToSpecifiedPosition(int pos, int data){ //This is how we add new node in a specified location.
        Node newnode = new Node(data);

        if(head == null){
            System.out.println("Specified location is  not available.");
        }
        else{
            if(pos == count + 1){
                AddNodeAtEnd(data);
            }
            else if(pos == 1){
                AddNodeInBeginning(data);
            }
            else{

                Node  current  = head;
                Node temp = null;

                for(int i = 1; i < pos -1; i++){
                    current = current.next;
                }

                temp = current.next;
                temp.prev = current;

                current.next = newnode;
                newnode.prev = current;
                newnode.next = temp;
                temp.prev = newnode;
            }
            count++;
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
        Dlist.AddNewNode(1);
        Dlist.AddNewNode(2);
        Dlist.AddNewNode(3);
        
       
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
    
    System.out.println();
    System.out.println("This is how the list looks like, after we added the new node at specified position:  ");
    Dlist.addNodeToSpecifiedPosition(3, 5);
    Dlist.display();
       
   }

    
}
