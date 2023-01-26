//정수형 배열을 매개변수로 받아 배열의 모든 요소 중 최대값을 리턴하는 메소드를 만들고 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;


        System.out.print("원하는 배열의 개수를 입력하세요 : ");
        x = sc.nextInt();

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print((i + 1) + "번째 배열의 수를 입력하세요 : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("입력한 배열은 다음과 같습니다.");

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n==============================");

        System.out.println("입력한 배열중 최대값은 : " + findmax(arr));

        System.out.println("입력한 배열중 최소값은 : "+ findmin(arr));


    }

    public static int findmax(int[] arr1) {
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        return max;
    }

    public static int findmin(int[] arr1) {
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        return min;
    }
}

