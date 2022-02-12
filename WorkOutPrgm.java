import java.util.Scanner;

public class WorkOutPrgm {

    public static void myadd(int n1, int n2){
        int sum = n1 + n2;
        System.out.println("Sum of numbers is : " +sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to do the addition :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        myadd(num1,num2);
    }
}
