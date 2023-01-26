//10번 문제를 풀었다면, 10번 문제에서 매개변수로 받는 이름, 나이, 주소를 scanner를 통한 입력으로 바꾸어 풀어보세요.

package Example;

import java.util.Scanner;

public class Ex1_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        String name, location;

        System.out.print("이름을 입력하세요: ");
        name=sc.next();
        System.out.print("나이를 입력하세요: ");
        age=sc.nextInt();
        System.out.print("주소를 입력하세요: ");
        location=sc.next();

        personalInformation(name, age, location);

    }
    public static void personalInformation(String name, int age, String location){
        System.out.println("이름은 "+name+"입니다.\n"+"나이는 "+age+"입니다.\n"+"주소는 "+location+"입니다.");
    }

}
