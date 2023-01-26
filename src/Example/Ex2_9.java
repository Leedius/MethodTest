//한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.

package Example;

import java.util.Scanner;

public class Ex2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("원하는 정수를 입력하세요 : ");
        num = sc.nextInt();

        System.out.println("1 부터 "+num+"까지의 홀수의 합은 : "+sum(num));

    }
    public static int sum(int num) {
        int sum=0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        num=sum;
        return num;
    }
}
