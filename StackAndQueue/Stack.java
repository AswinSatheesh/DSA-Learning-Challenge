package StackAndQueue;

import java.util.Currency;

public class Stack {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node top;

    public void push(int data){  //This is how we insert data into a stack.
        Node newnode = new Node(data);
        if(top == null){
            top = newnode;
        }
        else{
            newnode.next = top;
            top = newnode;
        }
       
    }

    public void pop(){  //This is how we delete a data from a stack.
        if(top == null){
            System.out.println("Stack underflow");
            return;
        }
        top = top.next;

    }

    public void display(){ //This is how we display list
        Node current = top;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(7);
        stack.push(9);

        System.out.println("Original list");
        stack.display();

        System.out.println();
        System.out.println("After pop operation did");
        stack.pop();
        stack.display();
    }
}
