//scanner로 정수 두 개를 입력받아, 입력받은 두 수를 매개변수로 사용하여 두 수의 합을 출력하는 메소드를 선언하고
//호출해보세요.

package Example;

import java.util.Scanner;

public class Ex1_13 {
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
        int sum=num1+num2;
        System.out.println("두 매개변수의 합은 : "+sum);
    }
}
