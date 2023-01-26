//두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 리턴하는 메소드를 선언하고 사용해보세요.

package Example;

public class Ex2_4_다른풀이 {
    public static void main(String[] args) {
        String result=test2_4("abc","edf");
        System.out.println(result);
    }
    public static String test2_4(String a, String b){
        return a+b;
    }
}
