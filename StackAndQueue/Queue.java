package StackAndQueue;

public class Queue {
    static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
        }
    }

    public Node front;
    public Node rear;

    void enqueue(int data){  //This is how we insert data into a queue.
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue(){  //This is how we delete a node from the queue.
        if(front == null){
            System.out.println("Queue is underflow");
            return;
        }
        front = front.next;

        if(front == null){
            rear = null;
        }
           
    }

    public void display(){ //This is how we display list
        Node current = front;
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(14);
        queue.enqueue(44);

        System.out.println("Original queue");
        queue.display();

        System.out.println("After doing dequeue operation.");
        queue.dequeue();
        queue.display();
    }

}
