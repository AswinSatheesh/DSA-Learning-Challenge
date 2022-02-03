public class ArrayToMethodEx3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        sum(arr);
    }
    public static void sum(int[] arr){
        int sum =0;
        for (int i =0; i < arr.length; i++){
            sum += i;
        }
        System.out.println("The sum of the numbers are :" + sum);
    }
}
