//정수 하나를 매개변수로 받아 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해세요.

package Example;

public class Ex3_1_다른풀이 {
    public static void main(String[] args) {
        test3_2(5);
    }
    public static void test3_2(int num){
        for(int i=1; i<10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
