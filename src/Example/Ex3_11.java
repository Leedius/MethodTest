package Example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex3_11 {
    public static void main(String[] args) {
        int[] x = {5,3,1};
        int[] y = {3,7,9};

        switching(x, y);

        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x));
        }
    }

    public static void switching(int[] x, int[] y){
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = x[i];
            x[i] = y[i];
            y[i] = arr[i];
        }
    }
}
