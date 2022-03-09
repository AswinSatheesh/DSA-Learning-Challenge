public class RecursionPrblm {
    public static void f(int n) {
            if(n <= 1){
                return;
            }
            f( n - 1);
            System.out.print(n + " "); 
            f( n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        f(n);
        
    }
}

//output - 2 3 2 4 2 3 2 5 2 3 2 4 2 3 2 