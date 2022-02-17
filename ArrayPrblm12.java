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
        System.out.println(Arrays.toString(arr));

        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i+1]);
            break;
        }
        
    }
    public static void main(String[] args) {
        ArrayPrblm12 obj = new ArrayPrblm12();
        int[] arr = {12,34,2,34,33,1};
        obj.secondMaxNum(arr);
    }
}
