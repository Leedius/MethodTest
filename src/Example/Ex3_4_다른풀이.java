package Example;

public class Ex3_4_다른풀이 {
    public static void main(String[] args) {
        if(isEven(1)){
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }
    }

    //even : 짝수
    //odd : 홀수
    public static boolean isEven(int num){
            return num%2==0 ? true : false;
        }
    }

