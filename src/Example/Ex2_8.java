//세 정수를 매개변수로 받아, 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.

package Example;

import java.util.Scanner;

public class Ex2_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1, num2, num3, x;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        num1=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        num2=sc.nextInt();
        System.out.print("원하는 세번째 정수를 입력하세요: ");
        num3=sc.nextInt();

        System.out.println("세 정수의 평균은 : "+getAvg(num1,num2,num3));

    }
    public static double getAvg(int num1, int num2, int num3) {

        return (num1+num2+num3)/(double)3;
    }
}
