//두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 리턴하는 메소드를 선언하고 사용해보세요.

package Example;

import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text1, text2;

        System.out.print("원하는 첫번째 문자열을 입력하세요: ");
        text1=sc.next();
        System.out.print("원하는 두번째 문자열을 입력하세요: ");
        text2=sc.next();

        System.out.println("==============================");
        System.out.println("모든문자열을 나열하면 : "+arrangeText(text1,text2));
    }
    public static String arrangeText(String text1, String text2){
        return text1+text2;
    }
}
