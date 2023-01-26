//문자열 배열을 매개변수로 받아 배열에 저장된 모든 문자열을 나열하여 리턴하는 메소드를 만들고 호출해보세요.

package Example;

import java.util.Scanner;

public class Ex3_7 {
    public static <string> void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x;


        System.out.print("원하는 배열의 개수를 입력하세요 : ");
        x=sc.nextInt();

        String[] arr=new String[x];

        for(int i=0; i<x; i++) {
            System.out.print((i + 1) + "번째 배열의 글자를 입력하세요 : ");
            arr[i] = sc.next();
        }
        String sumarr=arrange(arr);
        System.out.println("모든 문자를 나열하면 : "+sumarr);

    }
    public static String arrange(String[] arr1){
        String sumarr="";
        for(int i=0; i< arr1.length; i++){
            sumarr+=arr1[i];
        }
        return sumarr;
    }
}
