/* 
    Given an array or string, the task is to reverse the array or string .

    Ex: given array = {2,11,5,10,7,8}
        result array = {8,7,10,5,11,2}

*/

public class ArrayPrblm9 {
    public int[] reverseArray(int[] arr){
        int n = arr.length - 1;
        System.out.print("Reversed one : ");
        for (int i = n; i >= 0; i--){
            System.out.print(" " +arr[i] + " ");
        }
        System.out.println();
        return arr;
    }
    public static void main(String[] args) {
        ArrayPrblm9 obj = new ArrayPrblm9();
        int[] arr = {2,11,5,10,7,8};
        
        System.out.print("Original one : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " +arr[i] + " ");
        }
        System.out.println();

        obj.reverseArray(arr);
    }
}
