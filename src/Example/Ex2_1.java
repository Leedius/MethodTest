//두 정수를 매개변수로 받아, 두 정수의 합을 리턴하는 메소드를 선언하고 호출하여 결과를 확인하세요.

package Example;

import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        num1=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        num2=sc.nextInt();

        System.out.println("두 수의 합은 : "+getSum(num1,num2));

    }
    public static int getSum(int num1, int num2){
        return num1+num2;
    }
}
