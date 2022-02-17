/* 
    Given an array or string, the task is to reverse the array or string .

    Ex: given array = {2,11,5,10,7,8}
        result array = {8,7,10,5,11,2}

*/


import java.util.Arrays;

public class ArrayPrblm10 {
    public int[] myfunc(int[] array, int start, int end){
        int temp = 0;
        while(start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
    public static void main(String[] args) {
        ArrayPrblm10 obj = new ArrayPrblm10();

        int[] array = {8,7,10,5,11,2};
        System.out.print("Before reversing Array : " + Arrays.toString(array));
        System.out.println();
        int start = 0;
        int end = array.length - 1;
        int[] finalArray = obj.myfunc(array,start,end);  //by using the object calling the function and storing the result into a new array.
        System.out.println("After reversing Array : " +  Arrays.toString(finalArray));
    }
}
