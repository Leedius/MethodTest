package Example;

import java.util.Scanner;

public class Ex1_17_다른풀이 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;

        System.out.print("원하는 첫번째 정수를 입력하세요 : ");
        num1=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요 : ");
        num2=sc.nextInt();

        test1_17(num1, num2);

    }

    public static void test1_17(int num1, int num2) {
        int fromNum = num1 >= num2 ? num2 : num1;
        int toNum = num1 >= num2 ? num1 : num2;
        for (int i = fromNum + 1; i < toNum; i++) {
            System.out.print(i+" ");
        }
    }
}