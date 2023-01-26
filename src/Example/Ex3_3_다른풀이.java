package Example;

public class Ex3_3_다른풀이 {
    public static void main(String[] args) {
        int rand = test3_3();
        System.out.println(rand);

        //System.out.println(test3_3());        -> 위의 두 줄과 같은 결과 도출
    }
    public static int test3_3(){
        return (int)(Math.random()*50+1);          // 1<= x < 51Math(클래스), random(메소드)

    }
}
