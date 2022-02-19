package Arrays_Prblms;

import java.util.Arrays;

public class Resize_Array {
    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        Resize_Array obj = new Resize_Array();

        int[] arr = {5,1,2,9,10};
        System.out.println("Size of the original array is : " + arr.length);

        int[] result =obj.resize(arr, 10);

        for(int j = 0; j < result.length; j++){
            System.out.print(result[j]+ " ");
        }
        System.out.println();
        System.out.println("Size of the  array after resizing is : " + result.length);
    }
}
