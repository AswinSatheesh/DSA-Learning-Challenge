/*
    Given an array of integers, write a function to move all 0's to end of it while maintaining the relative order of the non-zero elements.
    ex:-  array = {0,1,0,4,12}
        solution = {1,4,12,0,0}

*/

package Arrays_Prblms;

import java.util.Arrays;

public class MoveZeroToEnd {
    public int[] myfun(int[] arr){
        int n = arr.length;
        int j = 0;

        for(int i = 0; i < n; i++){     
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        MoveZeroToEnd obj = new MoveZeroToEnd(); 
        int[] arr = {8,0,1,0,4,12};
        int[] resultArray = obj.myfun(arr);
        System.out.println(Arrays.toString(resultArray));

    }
}
  