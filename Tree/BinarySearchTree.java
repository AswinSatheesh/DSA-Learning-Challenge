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

    public void insert(int data){ //This is how we insert data into the tree.
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

    public boolean contains(int data){ // This is how we check whether the node is present or not in the tree.
        Node currentNode = root;
        while(currentNode != null){
            if(data < currentNode.data){
                currentNode = currentNode.left;
            }
            else if(data > currentNode.data){
                currentNode = currentNode.right;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public void remove(int data){

    }

    

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(11);
        
        System.out.println(tree.contains(66));
    }
}
