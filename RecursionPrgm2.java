import java.util.Scanner;

public class RecursionPrgm2 {
    public static void recu(int n){
        if(n <= 1){
            return;
        }
        recu(n - 1);
        System.out.print(n + " ");
        recu(n - 1);
    }
    public static void main(String[] args) {
        RecursionPrgm2 obj = new RecursionPrgm2();
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        obj.recu(n);
    }
}
