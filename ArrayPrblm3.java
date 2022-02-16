import java.util.Arrays;

//This is a prgm where the number user select move to the right end of the array, if the number is 6 , all 6 moves to the right end of the array.

public class ArrayPrblm3 {
    public static int[] moveElementToRight(int arr[], int target){
        int temp;
        for (int i = 0; i < 1; i++){
            for (int j = arr.length - 1; j >= 0; j--){
                if(arr[j] == target){
                    j--;
                }
                if(arr[i] == target){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
                if(arr[i] == arr[j]){
                    break;
                }
            }
        }

        return  arr;
    }
    public static void main(String[] args) {
        int[] arr = {6,1,6,8,10,4,15,6,3,9,6};
        int target = 6;
        int[] result = moveElementToRight(arr,target);
        System.out.println(Arrays.toString(result));

    }
}
