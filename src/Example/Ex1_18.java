//두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex1_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        num1=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        num2=sc.nextInt();


        betweenNum(num1,num2);
    }
    public static void betweenNum(int num1, int num2){
        Scanner sc=new Scanner(System.in);
        int d;
        System.out.print("원하는 배수를 입력하세요: ");
        d=sc.nextInt();
        if(num1>num2){
            int max=num1;
            num1=num2;
            num2=max;
        }
        for(int i=num1+1; i<num2; i++){
            if(i%d==0){
                System.out.print(i+" ");
            }
        }
    }
}
