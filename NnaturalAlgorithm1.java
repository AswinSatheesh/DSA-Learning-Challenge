public class NnaturalAlgorithm1 {
    public static int findSum(int n){
        return n * (n + 1)/2;
    }
    public static void main(String[] args) {
        int result = findSum(5);
        System.out.println("The sum of the given number is : " + result);
    }
}
