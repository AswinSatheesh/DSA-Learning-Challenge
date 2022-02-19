package Arrays_Prblms;

public class ZpatternPrint {
    public void myfun(int n){
        int i,j;

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                if(i == 0 || i == n-1 || j == n - 1 - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ZpatternPrint obj = new ZpatternPrint();
        int n = 5;
        obj.myfun(n);
    }
}
