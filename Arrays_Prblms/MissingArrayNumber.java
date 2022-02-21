package Arrays_Prblms;
//
public class MissingArrayNumber {
    public int myfun(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n + 1)/2;

        for(int num : arr){
            sum = sum - num;
        }

        return sum;
        
    }
    public static void main(String[] args) {
        MissingNumberInArray obj = new MissingNumberInArray();
        // int n =10;
        int[] arr ={1,3,5,8,2,4,7};
        int result = obj.myfun(arr);
        System.out.println("The missing number is : " + result);
    }
}
