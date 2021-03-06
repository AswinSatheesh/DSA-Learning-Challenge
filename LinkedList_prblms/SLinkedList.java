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
    public static int size;

    public void addNode(int data){  //addNode() is to add new nodes
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;

            tail = newNode;
        }
        size++;
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

    public void reverse(Node current){ // This is how we reverse a list and print it in reverse order.
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        else{
            if(current.next == null){
                System.out.print(current.data + " ");
                return;
            }
            reverse(current.next);
            System.out.print(current.data + " ");
            
        }
    }

    public void deleteFromStrart(){ //This is how you can delete node from the begining of the list.
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        else{
            if(head != tail){
                head = head.next;
                return;
            }
            else{
                head = tail = null;
            }
        }
    }

    public void deleteFromMiddle(){ // This is how we delete node from the middle of the LinkedList.
        Node temp, current;

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            int count = (size % 2 == 0)? (size / 2) : ((size + 1) / 2);

            if(head != tail){
                temp = head;
                current = null;

                for(int i = 0; i < count - 1; i++){
                    current = temp;
                    temp = temp.next;
                }

                if(current != null){
                    current.next = temp.next;
                    temp = null;
                }
                else{
                    head = tail = temp.next;
                    temp = null;
                }
            }
            else{
                head = tail = null;
            }
        }
        size--;
    }

    public void deleteFromEnd(){  //This is how we delete node from the End of a LinkedList.
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            if(head != tail){
                Node current = head;
                while(current.next != tail){
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else{
                head = tail = null;
            }
        }
    }

    public void addAtStart(int data){  //This is to add a new node to the first position.
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void searchNode(int data){ //This is how we search whether a particular data is present or not.
        Node current = head;
        int i = 1;
        boolean flag = false;

        if(head == null){
            System.out.println("List is empty.");
        }else{
            while(current != null){
                if(current.data == data){
                    flag = true;
                    break;
                }else{
                    i++;
                    current = current.next;
                }
            }
            if(flag){
                System.out.println("Element is present in the list position : "+ i);
            }else{
                System.out.println("Element is not present in the list.");
            }
        }
    }

    public void minNode(){ //This is how we find the minimum node form the list.
        Node current = head;
        int min;

        if(head == null){
            System.out.println("List is empty.");
        }else{
            min = head.data;
            while(current != null){
                if(min > current.data){
                    min = current.data;
                }
                current = current.next;
            }
            System.out.println("Minimum value node in the list: " + min);
        }
    }

    public void maxNode(){ //This is how we find the maximum node from the list.
        Node current = head;
        int max;

        if(head == null){
            System.out.println("List is empty.");
        }
        else{
            max = head.data;
            while(current != null){
                if(max < current.data){
                    max = current.data;
                }
                current = current.next;
            }
            System.out.println("Maximum value node in the list : " + max);
        }
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
            sList.addNode(11);  // adding nodes
            sList.addNode(12);
            sList.addNode(60);
            sList.addNode(378);
            sList.addNode(4);
            sList.addNode(5);

            System.out.println("Original Linked List :");
            sList.display();  // calling display function to display all nodes

            // System.out.println("No of nodes present in this LinkedList is : " + sList.countNode());

            // System.out.println();

            // System.out.println("Reversed List is : " );
            // sList.reverse(sList.head);

            // System.out.println();

            // System.out.println("First node removed!!");
            // sList.deleteFromStrart();
            // sList.display();
           
            // System.out.println("Total count is : " + size);
            // // int size = sList.countNode();

            // sList.deleteFromMiddle();
            // sList.display();

            // System.out.println("Total count is : " + size);

            // sList.deleteFromEnd();
            // sList.display();

            // sList.addAtStart(15);
            // sList.display();

            // sList.searchNode(15);
            // sList.searchNode(60);

            sList.minNode();
            sList.maxNode();

        }

}
