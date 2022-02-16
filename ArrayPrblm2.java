//It is a array prgm where  we have to find the two elements there sum is 10. 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;  

public class ArrayPrblm2 {

    public static int[] myfun(int[] arr, int length, int sum){
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < length; i++){
           int num = arr[i];
           int check = sum - num;
           if (nums.contains(check)){
               return new int[]{num, check};
           }else{
               nums.add(num);
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
        
        // System.out.println(Arrays.toString(result));
        for(int j = 0; j < result.length; j++){
            System.out.println(result[j]);
        }
    }
}
