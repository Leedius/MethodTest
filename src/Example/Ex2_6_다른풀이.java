package Example;

import java.util.Scanner;

public class Ex2_6_다른풀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("원하는 정수를 입력하세요 : ");
        num = sc.nextInt();

        System.out.println(test2_6(num));
    }
    public static String test2_6(int num){
        //문자열 -> 정수
        //int aa = Integer.parseInt("10");            parseInt->메소드

        //정수 -> 문자열
        //String aa = String.value0f(10);
        return num+"";      //(String)num 안됨.
    }
}
