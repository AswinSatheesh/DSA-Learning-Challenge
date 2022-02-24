package LinkedList_prblms;

public class SLinkedList { //Class
    class Node{
        int data;
        Node next;

        public Node(int data){ // Constructor
            this.data = data;
            this.next = null;
        }
        
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){  //addNode() is to add new nodes
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;

            tail = newNode;
        }
    }

    public int countNode(){  // This how count the number of nodes
        int count = 0;
        Node current = head;

        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void display(){  // TO display all nodes
        Node current = head;

        if (current == null){
            System.out.println("List is empty!!");
            return;
        }

        System.out.println("Nodes of singly Linked List are : ");

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }


        public static void main(String[] args) {
            SLinkedList sList = new SLinkedList(); //Creating objects to call the methods inside
            sList.addNode(1);  // adding nodes
            sList.addNode(2);
            sList.addNode(3);
            sList.addNode(4);

            sList.display();  // calling display function to display all nodes

            System.out.println("No of nodes present in this LinkedList is : " + sList.countNode());

        }

}
