//매개변수로 정수를 입력받아, 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.

package Example;

import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("원하는 정수를 입력하세요: ");
        num = sc.nextInt();

        System.out.println(getText(num));

    }
    public static String getText(int num){
        String num1=(""+num);
        return num1;
    }
}
