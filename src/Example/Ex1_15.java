//두 정수를 매개변수로 받아, 두 정수가 모두 짝수이면, '두 수는 짝수입니다.'를 출력하고,
//한 정수만 짝수일 경우 ' 한 수만 짝수입니다.'를, 두 수 모두 홀수일 떄는 '두 수 홀수입니다.'를
//출력하는 메소드를 선언하고 호출해보세요

package Example;

import java.util.Scanner;

public class Ex1_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        num1=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        num2=sc.nextInt();

        System.out.println("==============================");

        num(num1, num2);
    }
    public static void num(int num1, int num2){
        if(num1%2==0&&num2%2==0){
            System.out.println("두 수는 짝수입니다");
        }
        else if(num1%2==0||num2%2==0){
            System.out.println("한 수만 짝수입니다");
        }
        else {
            System.out.println("두 수는 홀수입니다");
        }
    }

}
