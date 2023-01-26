//한 문자열과 정수를 매개변수로 받아, 매개변수로 받은 문자열을 매개변수로 받은 숫자만큼
//반복 출력하는 메소드를 선언하고 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex1_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        String text;

        System.out.print("원하는 글자를 입력하세요: ");
        text=sc.next();
        System.out.print("원하는 정수를 입력하세요: ");
        num=sc.nextInt();

        loopText(text, num);

    }
    public static void loopText(String text, int num){
        for(int i=0; i<num; i++){
            System.out.print(text+"");
        }
    }

}
