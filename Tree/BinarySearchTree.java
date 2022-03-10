package Tree;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left, right;

        public Node(int item){
            data = item;
        }
    }

    Node root;

    public void insert(int data){
        Node currentNode = root;
        if(currentNode == null){
            root = new Node(data);
            return;
        }
        while(true){
            if(data < currentNode.data){
                if(currentNode.left == null){
                    currentNode.left = new Node(data);
                    break;
                }else{
                    currentNode = currentNode.left;
                }
            }else{
                if(currentNode.right == null){
                    currentNode.right = new Node(data);
                    break;
                }else{
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public boolean contains(int data){
        Node currentNode = root;
        return false;
    }

    public void remove(int data){

    }
}
