import java.util.Scanner;

public class CheckMultipleInputs {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter  number of elements : ");
       int n = s.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the elements :");
       for (int i = 0; i < n; i++){
           arr[i] = s.nextInt();
       }
       System.out.println("Entered numbers are :");
       for(int i: arr){
           System.out.println(i);
       }

   } 
}
