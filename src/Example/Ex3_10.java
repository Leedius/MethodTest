package Example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        int[] result = switching(x, y);

        System.out.println(result[0]+" "+result[1]);



    }

    public static int[] switching(int x, int y){
        int a;
        a = x;
        x = y;
        y = a;
        return new int[] {x,y};
    }
}
