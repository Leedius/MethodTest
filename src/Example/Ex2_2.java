package Example;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        num2 = sc.nextInt();

        System.out.println("두 수의 곱은 : "+getmul(num1, num2));

    }

    public static int getmul(int num1, int num2) {
        return num1 * num2;
    }
}
