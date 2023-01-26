//두 저ㅇ수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex1_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        num1=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        num2=sc.nextInt();

        num(num1, num2);
    }
    public static void num(int num1, int num2){
        System.out.println("몫 :"+num1/num2+"  나머지 : "+num1%num2);
    }

}
