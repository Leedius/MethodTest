package Example;

public class Ex3_2_다른풀이 {
    public static void main(String[] args) {
    test3_3(10);

    }

    public static void test3_3(int num){
        for(int i=1; i<101; i++){
            if(i % num == 0){
                System.out.print(i+" ");
            }
        }
    }
}
