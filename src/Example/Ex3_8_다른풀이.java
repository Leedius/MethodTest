//정수형 배열 두 개를 매개변수로 받아 두 배열의 모든 요소를 갖는 새로운 배열을 리턴하는 메소드를 만들고 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex3_8_다른풀이 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] a = {5,6,7,8};
        int[] b = {1,2,3,4};
        int[] result = test3_8(a,b);


        for(int e : result){
            System.out.print(e + " ");
        }



    }
    public static int[] test3_8(int[] arr1, int[] arr2){
        //arr1 = {1,2,3}, arr2={4,5,6}
        //->{1,2,3,4,5,6}
        int[] resultArr = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++){
            resultArr[i]=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            resultArr[i+arr1.length]=arr2[i];
        }
        return resultArr;
    }
}
