public class ArrayEx1 {
    public static void main(String[] args){
        int arr1[] = new int[5];
        arr1[0] = 1;
        arr1[1] = 2; 
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        
        for (int i = 0; i < arr1.length; i++ ){
            System.out.println("Element at index " + i + " is : " + arr1[i]);
        }
    }
}
