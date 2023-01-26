package Example;

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1, num2;

        System.out.print("원하는 첫번째 정수를 입력하세요: ");
        num1=sc.nextInt();
        System.out.print("원하는 두번째 정수를 입력하세요: ");
        num2=sc.nextInt();

        System.out.println(getMax(num1,num2));

    }
    public static int getMax(int num1, int num2){
//        if(num1>num2){
//            return num1;
//        }
//        else{
//            return num2;
//        }

        //삼항 연산자
        //참 또는 거짓 조건 ? 참일 때의 값 : 거짓일 때의 값
        return num1 > num2 ? num1 : num2;

    }
}
