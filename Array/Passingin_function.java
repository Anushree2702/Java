package Array;

import java.util.Arrays;

public class Passingin_function {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr)
    {
        arr[1]=7;
        arr[3]=444;
    }
    
}