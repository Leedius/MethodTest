//정수 하나를 매개변수로 받아 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해세요.

package Example;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("원하는 정수를 입력하세요 : ");
        num = sc.nextInt();

        mTable(num);
    }
    public static void mTable(int num){
        for(int i=1; i<10; i++){
            System.out.println(num+"*"+i+" = "+num*i);
        }
    }
}
