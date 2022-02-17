import java.util.Arrays;

//This is a prgm to find the Minimum value in an array

public class ArrayPrblm11 {
    public int MinumValue(int[] array){

        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Invalid input!!");  //This is how we can throw exception.
        }

        int min = array[0]; // min will hold the first value of the array, we consider this as the min at first.
        for(int i = 1;  i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        // System.out.println("Minum value of the array is : " + min);
        return min;

    }
    public static void main(String[] args) {
        ArrayPrblm11 obj = new ArrayPrblm11();
        int[] array = {5,9,3,15,11,2,1};
        int result = obj.MinumValue(array);
        System.out.println("Minum value of the array is : " + result);
        
    }
}
