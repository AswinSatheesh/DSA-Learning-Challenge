import java.util.Arrays;

public class Arrayprblm4 {
    public static int[] myfun(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        int temp = 0;
        while(i<j){
            if (arr[i] == target){
                if (arr[j] == target){
                    j--;
                }else{
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++;
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,1,6,7,8,4,5,6};
        int target = 1;
        int[] result = myfun(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
