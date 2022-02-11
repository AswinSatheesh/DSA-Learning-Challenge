import java.io.*;
 
import java.util.*;
 
public class FactorialReference {
 
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int f = factorial(n);
    System.out.println(f);
  }
 
  public static int factorial(int n) {
    if (n == 1) { //1
      return 1;
    }
 
    int fnm1 = factorial(n - 1); //2
    int fn = n * fnm1;  //3
    return fn;  //4
  }
}

