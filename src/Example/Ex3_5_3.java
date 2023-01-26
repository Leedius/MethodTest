package Example;

public class Ex3_5_3 {
    public static void main(String[] args) {
        int[] a={5,6,7};
        int[] result=test3_5_3(a);
        for (int i=0; i<result.length; i++) {
            System.out.print(i + " ");
        }
    }

    //매개변수로 정수형 배열을 받아, 각 요소의 값에 +1한 배열을 리턴.
    //1,2,3 -> 2,3,4
    public static int[] test3_5_3(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]+=1;
        }
        return arr;
    }
}
