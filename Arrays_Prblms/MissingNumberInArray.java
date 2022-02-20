/*
    Given an array of n-1 distinct numbers in the range of 1 to n . FInd the missing number in it.
    arr ={2,4,1,8,3,7}

    output : 5
    Explanation  : The missing number form range 1 to 8 is 5. 
*/

package Arrays_Prblms;

public class MissingNumberInArray {
    public int myfun(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n + 1)/2;

        for(int num : arr){
            sum = sum - num;
        }

        return sum;
        
    }
    public static void main(String[] args) {
        MissingNumberInArray obj = new MissingNumberInArray();
        // int n =10;
        int[] arr ={1,3,5,8,2,4,7};
        int result = obj.myfun(arr);
        System.out.println("The missing number is : " + result);
    }
}
