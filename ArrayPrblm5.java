public class ArrayPrblm5 {
    public  void printArray(int[] Array){
        for (int i = 0; i < Array.length; i++){
            System.out.print (Array[i] + " ");
        }
    }
    public void arrayDemo(){
        int[] Array = new int[5]; //default values of integer is 0
        
        Array[0] = 10;
        Array[1] = 20;
        Array[2] = 30;
        Array[3] = 40;
        Array[4] = 50;
        Array[2] = 60; //Replace existing value into this new value in Array of second position.
        System.out.println(Array[Array.length-1]); // This will print the last element of the array
        printArray(Array);
        // Array[5] = 100; // If we try to add values to the array index which doesn't exist(here till index 4 its available we try 5th index) so it will show  "java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5" 
    }
    public static void main(String[] args) {
        ArrayPrblm5 arrUtil = new ArrayPrblm5();
        arrUtil.arrayDemo();
    }
}
