import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.*;

public class ArrayListPrgm {

    public static Integer[] myfunc(int y, Integer array[], int x){
        int i;
        ArrayList <Integer> list =new  ArrayList<Integer>(Arrays.asList(array));


        list.add(x);
        array =list.toArray(array);
        return array;
        
    }
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7};
        int x = 58;
        int y = 7;
        int i =0;

        array = myfunc(y,array,x);

        System.out.println(Arrays.toString(array));
    }
}
