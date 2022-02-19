package Arrays_Prblms;

import java.util.Arrays;

public class SecMaxPrblm {
    public int myMaxFun(int[] arr){
        int maxValue = Integer.MIN_VALUE;
        int secMax   = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                secMax   = maxValue;
                maxValue = arr[i];
            }else if(arr[i] > secMax && arr[i] != maxValue){
                secMax = arr[i];
            }
        } 
        return secMax;
    }
    public static void main(String[] args) {
        SecMaxPrblm obj = new SecMaxPrblm();
        int[] arr = {4,6,9,6,15,14,21,15};
        System.out.println(Arrays.toString(arr));
        int result = obj.myMaxFun(arr);
        System.out.println("Second maximum element is : " +result);
    }
}
