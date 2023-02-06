package Example;

import java.util.Scanner;

public class Ex3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = {1, 2, 5, 4, 3};

        sort(x);


    }

    public static void sort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                int temp = 0;
                if (x[i] < x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }

            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
    }
}