//Math.random() 메소드를 활용하여 1~50의 수 중 랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자.

package Example;

public class Ex3_3 {
    public static void main(String[] args) {
        int a=1;
        System.out.println(rand(a));

    }
    public static int rand(int a){
        a=(int)(Math.random()*50+1);
        return a;

    }
}
