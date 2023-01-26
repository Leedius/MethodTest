package Method;

import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //printSum(10, 20);
        int x, y;

        System.out.print("첫번째 정수를 입력하세요 : ");
        x=sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        y=sc.nextInt();

        System.out.println("리턴값은 : "+getSum(x,y));

    }

    //매개변수로 정수 두 개를 받아, 두 수의 합을 출력
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    //매개변수로 정수 두 개를 받아, 두 수의 합을 리턴
    //리턴타입 void : 메소드 실행 후 리턴할 데이터가 없어요.
    //리턴 : 메소드를 호출한 영역에 결과를 돌려 줌.
    //리턴은 메소드의 마지막에 딱 한번만 호출 가능(리턴값 두개 불가능->배열을 쓰면 가능) 그 이후 코드를 추가로 넣을 수 없음.
    //!!삼항 연산자 조건 ? 참일때 값 : 거짓일때 값;
    public static int getSum(int x, int y) {
       return x+y;
    }
}
