import java.util.Arrays;

//Showing that if we try to access an array element (length 5 and you try to access 6) then it will show "ArrayIndexOutOfBoundsException" error:
public class Main {
    public static void main(String[] args) {
        // int[] Array = new int[5];                                                                
        // Array[5] = 7;
        // int[] arr = (10,20,30,40,50);
        int[] Arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(Arr));


        int[][] arr = new int[5][4];  
        
        

        System.out.println(Arrays.toString(arr));

    }
    
}
