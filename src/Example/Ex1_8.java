//두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 출력하는 메소드를 선언하고 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex1_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1, name2;

        System.out.print("원하는 첫번째 글자를 입력하세요: ");
        name1=sc.next();
        System.out.print("원하는 두번째 글자를 입력하세요: ");
        name2=sc.next();

        name(name1, name2);

    }
    public static void name(String name1, String name2){
        System.out.println(name1+name2);
    }


}
