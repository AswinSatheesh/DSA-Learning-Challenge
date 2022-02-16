// Reference prgm 1

// public class Testing

// {
//     public static int[] SwapToEnd(int[] Array,int target)
//     {
//         int j = Array.length - 1;
//             for (int i = 0; i < Array.length; i++) 
//             {
//                 if (Array[i] == target && i < (j - 1))
//                 {
//                     while (Array[j] == target && i < (j - 1))
//                     {
//                         j--;
//                     }
//                     int temp = Array[j];
//                     Array[j] = Array[i];
//                     Array[i] = temp;
//                 }
//             }
//             return Array;
//     }
    
    
// 	public static void main(String[] args) 
// 	{
// 	    int[] Array={6,1,6,8,10,4,15,6,3,9,6};
// 	    int target=6;
// 	    System.out.print("Before : "); 
// 	    for(int i=0;i<Array.length;i++)
// 	    {
// 	        System.out.print(Array[i]+" "); 
// 	    }
	    
// 	    int[] Result=SwapToEnd(Array,target);
	    
// 	    System.out.print("\nAfter  : "); 
// 	    for(int i=0;i<Result.length;i++)
// 	    {
// 	        System.out.print(Result[i]+" "); 
// 	    }
// 	}
// }



//// Reference prgm 2

// public class Testing{

//     public static int[] arrange (int[] array, int target){
//         int i = 0;
//         int j = array.length-1;
        
//         while(i<j){
//             if(array[i]!=target)
//                 i++;
//             if(array[j]==target)
//                 j--;
//             if(array[i]==target && array[j]!=target){
//                 int temp = array[i];
//                 array[i] = array[j];
//                 array[j] = temp;
//             }
//         }
//         return array;
//     }
    
//      public static void main(String []args){
//         int[] array = new int[]{6,1,6,8,10,4,15,6,3,9,6};
//         int target = 6;
//         int[] result = arrange(array, target);
//         for(int i=0;i<result.length; i++){
//             System.out.println(result[i]);
//         }
//      }
// }




//// Reference prgm 3  This prgm selected as the winning prgm in that competition

public class Testing
{
    public static int[] rearrangeArray(int[] arr, int num) {
        int i=0, j=arr.length-1;
        while(i < j ){
            if(arr[i] == num) {
                if(arr[j] == num) {
                    j-=1;
                }
                else {
                    arr[i] += arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                    // int temp = 0;
                    // temp = arr[j];
                    // arr[j] = arr[i];
                    // arr[i] = temp;
                    i++;
                    j--;
                }
            } 
            else {
                i++;
            }
        }
        return arr;
    }
    
	public static void main(String[] args) {
		int[] arr = {8,6,1,6,7,8,4,5,6};
		int num = 6;
        int[] res = rearrangeArray(arr, num);
        for(int k=0; k<res.length; k++) {
            System.out.println(res[k]);
        }
	}
}
