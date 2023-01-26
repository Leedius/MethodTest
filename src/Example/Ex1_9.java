//이름을 매개변수로 받아 이름을 출력하는 메소드, 나이를 매개변소루 받아 나이를 출력하는 메소드,
//주소를 매개 변수로 받아 주소를 출력하는 메소드를 각각 만들고 출력결과가 아래와 같게 프로그래밍하세요.
//-출력결과 예시-
//이름은 이창영입니다.
//나이는 35살입니다.
//주소는 울산입니다.


package Example;

import javax.naming.Name;
import java.util.Scanner;

public class Ex1_9 {
    public static void main(String[] args) {

        personalInformation("이창영", 35, "울산");

    }
    public static void personalInformation(String name, int age, String location){
        System.out.println("이름은 "+name+"입니다.");
        System.out.println("나이는 "+age+"입니다.");
        System.out.println("주소는 "+location+"입니다.");

    }

}
