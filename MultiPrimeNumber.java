import java.util.Scanner;

public class MultiPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number of inputs :");
        Scanner count = new Scanner(System.in);
        int t = count.nextInt();

        System.out.println("Enter the elements :");
        int[] n = new int[t];
        for (int i = 0; i < t; i++){
            n[i] = count.nextInt();
        }

        //testing purpose

        // System.out.println("Entered numbers are :");
        // for(int i: n){
        //     System.out.println(i);
        // }
        
       for (int j =0; j < t; j++){
           if (n[j] %2 ==0){
               if(n[j] != 1 || n[j] != n[j]){
                System.out.println("not prime");
                }
           }
           else{
               System.out.println("prime");
           }
       }

    }
}
