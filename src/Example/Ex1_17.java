//두 정수를 매개변수로 받아, 두 정수 사이의 모든 숫자를 출력하는 메소드를 선언하고 호출해보세요.

package Example;

import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex1_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        num1=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        num2=sc.nextInt();

        betweenNum(num1, num2);

    }
    public static void betweenNum(int num1,int num2){
        if(num1>num2){
            int min = num1;
            num1 = num2;
            num2 = min;
        }
        for(int i=num1+1; i<num2; i++){
            System.out.print(i+" ");
        }
    }
}
