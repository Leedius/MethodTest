//임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90이상이면 'A', 70이상이면 'B'
//그 외의 수가 들어오면 'C'를 리턴하는 메소드를 선언하고 사용해보세요.

package Example;

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        System.out.print("원하는 점수를 입력하세요: ");
        score = sc.nextInt();

        System.out.println(grade(score));

    }

    public static String grade(int score) {
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else {
            grade = "C";
        }
        return grade;
    }
}