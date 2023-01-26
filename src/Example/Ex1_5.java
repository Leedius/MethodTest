//정수 두 개를 매개변수로 받아, 두 수 의 합을 출력하는 메소드를 선언하고 호출해 보세요.

package Example;

import java.util.Scanner;

public class Ex1_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, j;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        i=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        j=sc.nextInt();

        num(i, j);
    }
    public static void num(int num1, int num2){
        System.out.println(num1+num2);
    }
}
