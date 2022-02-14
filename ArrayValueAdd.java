import java.util.Arrays;

public class ArrayValueAdd {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for(int i =0; i< nums.length; i++){
            nums[i] = i + 2;
            // System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));

        // for( int j = 0; j < nums.length; j++){
        //     System.out.println(nums[j]);
        // }
        
    }
}
