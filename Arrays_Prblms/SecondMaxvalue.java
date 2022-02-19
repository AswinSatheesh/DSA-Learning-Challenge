/*
    Given an array of integers, return second maximum value.
    The second maximum value exists.
    Eg : input : arr = {13,34,2,34,33,1}
    output : 33

*/

package Arrays_Prblms;

public class SecondMaxvalue {
    public int findSecondMaxValue(int[] arr){
        
        int max = Integer.MIN_VALUE;  //Value of max : -2147483648
        // System.out.println(max);
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }else if(arr[i] > secondmax && arr[i]  != max){
                secondmax = arr[i];
            }
        }
        return secondmax;


    }
    public static void main(String[] args) {
        SecondMaxvalue obj = new SecondMaxvalue();
        int[] arr = {13,34,2,34,33,1};

        int result = obj.findSecondMaxValue(arr);
        System.out.println(" Second maximum value in this array is : " + result);

    }
}
