public class NnaturalAlgorithm2 {
    public static int findSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int res = findSum(5);
        System.out.println("Sum = "+ res);
    }
}
