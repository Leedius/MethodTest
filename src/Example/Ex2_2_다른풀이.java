package Example;

import java.util.Scanner;

public class Ex2_2_다른풀이 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int result=test2_2(a,b);
        System.out.println(result);
    }
    public static int test2_2(int a, int b){
        return a*b;
    }
}
