//정수 하나를 매개변수로 받아, 1~100까지의 수 중에서 매개변수로 받은 수의 배수를
//출력하는 메소드를 만들고 호출해보세요.

package Example;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, min, max;

        System.out.print("원하는 배수를 입력하세요 : ");
        num = sc.nextInt();
        System.out.print("최소값을 입력하세요 : ");
        min = sc.nextInt();
        System.out.print("최대값을 입력하세요 : ");
        max = sc.nextInt();

        multiple(num, min, max);

    }
    public static void multiple(int num, int min, int max){
        for(int i=min; i<=max; i++){
            if(i%num==0){
                System.out.print(i+" ");
            }
        }
    }
}
