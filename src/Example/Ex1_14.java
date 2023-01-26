//한 정수를 매개변수로 받아, 그 정수가 짝수이면 '짝수입니다', 홀수이면 '홀수입니다'를 출력하는 메소드를 선언하고 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex1_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;

        System.out.print("원하는 정수를 입력하세요: ");
        num1=sc.nextInt();

        oddEven(num1);
    }
    public static void oddEven(int num1){
//        if(num1==0){
//            System.out.println(num1+"은 0입니다.");
//        }
//        else if(num1%2==0){
//            System.out.println(num1+" 짝수입니다.");
//        }
//        else {
//            System.out.println(num1+" 홀수입니다.");
//        }
        String result = num1%2==0 ? "짝수입니다." : "홀수입니다.";
        System.out.println(result);
    }

}
