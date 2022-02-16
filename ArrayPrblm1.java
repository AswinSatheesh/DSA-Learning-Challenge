//It is a array prgm where  we have to find the two elements there sum is 10. 

import java.util.Arrays;

public class ArrayPrblm1 {

    public static int[] myfun(int[] arr, int length, int sum){
        for (int i = 0; i < length - 1; i++){
           for (int j = i+1; j < length; j++){
               if (arr[i] + arr[j] == sum){
                //    System.out.println("Two numbers are : " + arr[i] + ", " + arr[j]);
                return new int[]{arr[i], arr[j]}; //This is how we can return array
               }
           }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 9, 8, 0};
        // System.out.println(Arrays.toString(arr));  // This is how we can print array elements without using for loop.
        int sum = 10;
        int length = arr.length;

        int[] result = myfun(arr, length, sum);
        
        System.out.println(Arrays.toString(result));
    }
}
