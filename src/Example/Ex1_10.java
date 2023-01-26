//9번 문제를 하나의 메소드를 사용하여 출력결과가 같게 프로그래밍 해보세요.

package Example;

import java.util.Scanner;

public class Ex1_10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int age;
         String name, location;

         System.out.print("이름을 입력하세요: ");
         name = sc.next();
         System.out.print("나이를 입력하세요: ");
         age = sc.nextInt();
         System.out.print("주소를 입력하세요: ");
         location = sc.next();

         System.out.println("이름은 "+name+"입니다.\n"+"나이는 "+age+"입니다.\n"+"주소는 "+location+"입니다.");

    }
}