//한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는 메소드를 선언하고, 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex1_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;

        System.out.print("원하는 정수를 입력하세요: ");
        num1=sc.nextInt();

        num(num1);
    }
    public static void num(int num1){
        for(int i=0; i<=num1; i++){
            System.out.print(i+" ");
        }
    }
}
