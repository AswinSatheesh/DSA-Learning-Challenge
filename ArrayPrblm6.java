public class ArrayPrblm6 {
    public void myfunc(int[] array){
        int length = array.length;
        for(int i = 0; i < length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayPrblm6 array = new ArrayPrblm6();
        array.myfunc(new int[] {4,6,8,10}); //while calling array we can directly create a array and initialize it inside & declare using this way

    }
}
