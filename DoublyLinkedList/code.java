package DoublyLinkedList;

public class code {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }

    Node head, tail = null;
    public void addNode(int data){
        Node newNode =  new Node(data);
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

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        code obj = new code();

        obj.addNode(10);
        obj.addNode(20);
        obj.addNode(30);
        obj.addNode(40);

        obj.display();
    }
}
