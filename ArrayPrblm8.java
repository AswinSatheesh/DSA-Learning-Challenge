import java.util.Arrays;

/* Given an array of integers, return an array with even integers removed.

   eg: input : arr = {3,2,4,7,10,6,5}
        output : arr = {3,7,5}
    */

public class ArrayPrblm8 {

    public  int[ ] oddNumberCount(int[] arr){
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }
        // System.out.println(oddCount);
        int[] finalArray = new int[oddCount];
        int index = 0;
        for( int i =0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                finalArray[index] = arr[i];
                index++;
            }
        }
        return finalArray;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5,11};
        ArrayPrblm8 array = new ArrayPrblm8();
        int[] newArray =array.oddNumberCount(arr);
        System.out.println(Arrays.toString(newArray));
    }
}
