import java.util.Scanner;

public class FactorialNumber {
    public void factorial(int n, int fact){ //function
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        FactorialNumber obj = new FactorialNumber(); //creating a object to call the function.
        obj.factorial(n, fact);        
    }
}
