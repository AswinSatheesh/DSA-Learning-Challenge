import java.util.Arrays;

/*
    Given an array of integers, return second maximum value.
    The second maximum value exists.
    Eg : input : arr = {12,34,2,34,33,1}
    output : 33

*/

public class ArrayPrblm12 {
    public void secondMaxNum(int[] arr){
        Arrays.sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr)); // Sorting the array in ascending order.

        int maxEle = arr[arr.length-1];  // last element in the array is the largest element.
        System.out.println("largest element is : " + maxEle);
         
        int count = 0;   
        int j = arr.length-2;   //  took the second last element in j, and iterating from 0 index  to second last, checking if last element repeating in the array.
        // System.out.println("j value is : " + arr[j]);
        for(int i = 0; i <= j; i++){
            if(maxEle == arr[i]){  // checking if max ele is repeating, if the value repeat , increase the count and see how many times value repeat. 
                count++;
            }
        }
        int result = arr[j-count]; // from the last element minus the count(max value repeat times) then store the second max num in result variable.
        System.out.println("Second maximum element is : " + result);

    }
    public static void main(String[] args) {

        ArrayPrblm12 obj = new ArrayPrblm12();

        int[] arr = {12,34,2,34,33,1};
        obj.secondMaxNum(arr);
    }
}
