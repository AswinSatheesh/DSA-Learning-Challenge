import java.lang.reflect.Array;
import java.util.Arrays;

import javax.naming.ldap.ManageReferralControl;

public class ArrayValueAdd {
    // public static void main(String[] args) {
    //     int[] nums = new int[5];
    //     for(int i =0; i< nums.length; i++){
    //         nums[i] = i + 2;
    //         // System.out.println(nums[i]);
    //     }
    //     System.out.println(Arrays.toString(nums)); // This is one method to print array elements without using any loop.

    //     // for( int j = 0; j < nums.length; j++){
    //     //     System.out.println(nums[j]);
    //     // }
        
    // }

    //-------------------------------------------Another method to add new value into an array----------------------


    public static int[] myfun(int posi, int array[], int newEle){
        int[] newArray = new int[posi + 1];

        for (int i = 0; i < posi; i ++){
            newArray[i] = array[i];
        }

        newArray[posi] = newEle;
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = {6, 8, 10, 12};

        int newEle =99;

        int posi = 4;

        int[] finalarray = myfun(posi, arr, newEle);

        System.out.println("Array after adding the final element is : " + Arrays.toString(finalarray));
    }
}
