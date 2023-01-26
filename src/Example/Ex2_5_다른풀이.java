//임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90이상이면 'A', 70이상이면 'B'
//그 외의 수가 들어오면 'C'를 리턴하는 메소드를 선언하고 사용해보세요.

package Example;

public class Ex2_5_다른풀이 {
    public static void main(String[] args) {

    }
    public static String test2_5(int num){
        if(num>=90){
            return "A";
        }
        else if(num>=70){
            return "B";
        }
        else {
            return "C";
        }
    }
}
