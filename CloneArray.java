public class CloneArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int clarray[] = arr.clone();  //cloning of one-dimensional array
        for (int i = 0; i < clarray.length; i++){
            System.out.println(clarray[i]);
        }
    }
}
