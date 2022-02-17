/* Given an array of integers, return an array with even integers removed.

   eg: input : arr = {3,2,4,7,10,6,5}
        output : arr = {3,7,5}
    */
public class ArrayPrblm7 {
    public void myfunc(int[] arr){
        int length = arr.length;
        int i = 0;
        // using while loop  
        while(i < length){   
            if( arr[i] % 2 == 1){
                System.out.print(arr[i] + " ");
                i++;
            }
            else{
                // i++;
                continue;
            }
        }

        // using for loop

        // for(int i = 0; i < length; i++){
        //     if( arr[i] % 2 == 1){
        //         System.out.print(arr[i] + " ");
        //     }else{
        //         continue;
        //     }
        // }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        ArrayPrblm7  arrayP = new ArrayPrblm7();
        arrayP.myfunc(arr);
    }
}
