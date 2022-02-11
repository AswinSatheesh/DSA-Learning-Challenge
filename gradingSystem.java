import java.util.Scanner;

public class gradingSystem {
    public static String gradeSys(int n){
        if (n > 90){
            String s = "excellent";
            return s;
        }
        else if(n > 80 && n <= 90){
            String s1 = "good";
            return s1;
        }
        else if(n > 60 && n <= 70){
            String s2 = "meets expectations";
            return s2;
        }
        else if(n <= 60){
            String s3 = "below par";
            return s3;
        }
        return null;

        
    }
    public static void main(String[] args) {
        System.out.println("Enter the mark :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = gradeSys(n);
        System.out.println(result);
    }
}
