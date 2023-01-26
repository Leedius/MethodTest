//정수 하나를 매개변수로 받아, 매개변수가 짝수면 true, 홀수면 false를 리턴하는 메소드를 만들고 호출해보자.

package Example;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.print("원하는 정수를 입력하세요 : ");
        num = sc.nextInt();

        if(num(num)==true){
            System.out.println("짝수입니다");
        }
        else {
            System.out.println("홀수입니다");
        }
    }
    public static boolean num(int num1){
        return num1%2==0 ? true : false;
    }
}
