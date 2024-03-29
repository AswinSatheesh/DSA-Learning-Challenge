package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MinHeap {
    List<Integer> heap = new ArrayList<>();  //ArrayList created

    public MinHeap(){

    }

    public MinHeap(List<Integer> array){
        buildHeap(array);
    }

    private void buildHeap(List<Integer> array){
        heap = array;
        for(int i = parent(heap.size() - 1); i >= 0; i--){
            shiftDown(i);
        }
    }

    private void shiftDown(int currentIdx){ // To arrange the heap , re-arrange the nodes from top to bottom.
        int enIdx = heap.size()-1;
        int leftIdx = leftChild(currentIdx);
        while(leftIdx <= enIdx){
            int rightIdx = rightChild(currentIdx);
            int idxToShift;
            if( rightIdx <= enIdx && heap.get(rightIdx) < heap.get(leftIdx)){
                idxToShift = rightIdx;
            }else{
                idxToShift = leftIdx;
            }
            if(heap.get(currentIdx) > heap.get(idxToShift)){
                Collections.swap(heap, currentIdx, idxToShift);
                currentIdx = idxToShift;
                leftIdx = leftChild(currentIdx);
            }else{
                return;
            }
        }
    }

    private void shiftUp(int currentIdx){ // To arrange the heap , re-arrange the nodes from bottom to top .
     int parentIdx = parent(currentIdx);
     while(currentIdx > 0 &&  heap.get(parentIdx) > heap.get(currentIdx)){
         Collections.swap(heap, currentIdx, parentIdx);
         currentIdx = parentIdx;
         parentIdx = parent(currentIdx);
     }   
    }

    public int peak(){
        return heap.get(0);
    }

    public void remove(){  //while removing nodes from the heap - we have to remove it from the top.
        Collections.swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1); //ArrayList property  (we created a Arraylist called 'heap' and calling its inbuilt functions - remove)
        shiftDown(0);
    }

    public void insert(int value){
        heap.add(value); //Arraylist inbuilt functions add(to add values into the ArrayList)
        shiftUp(heap.size()-1);
    }

    private int parent(int i){
        
        return (i - 1) /2;
    }

    private int leftChild(int i){
        
        return (i * 2) + 1;
    }

    private int rightChild(int i){
        
        return (i * 2) + 2;
    }

    public void display(){
        for( int i = 0; i < heap.size(); i++){
            System.out.println(heap.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(6,2,8));
        MinHeap heap = new MinHeap(array);
        heap.display();
        System.out.println("aaa");
        heap.insert(1);
        heap.insert(5);
        heap.insert(15);
        heap.display();
        System.out.println("aaa");
        heap.remove();
        heap.display();
    }
}
