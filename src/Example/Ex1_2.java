//반갑습니다 라는 문자열을 출력하는 기능을 가진 메소드와 '어서오세요'라는 문자열을
//출력하는 메소드를 각각 선언하고, 시행 결과 '반갑습니다 어서오세요'라는 문자열을 출력되게 호출해보자.

package Example;

public class Ex1_2 {
    public static void main(String[] args) {
        hello(); welcome();
    }
    public static void hello(){
        System.out.print("반갑습니다 ");
    }
    public static void welcome(){
        System.out.println("어서오세요");
    }

}
