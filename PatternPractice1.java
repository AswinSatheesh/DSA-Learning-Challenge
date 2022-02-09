import java.util.Scanner;
public class PatternPractice1 {
    public static void main(String[] args) {
        int row, column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (row = 0; row < n; row++){
            for (column = 0; column < n; column++){
                if (row == 0 || row == n-1 || column == n-1-row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
