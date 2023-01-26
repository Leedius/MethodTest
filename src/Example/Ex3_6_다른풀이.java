//정수형 배열을 매개변수로 받아 배열의 모든 요소 중 최대값을 리턴하는 메소드를 만들고 호출해보세요.

package Example;

public class Ex3_6_다른풀이 {
    public static void main(String[] args) {
        int[] a ={5,10,100,200,150};
        System.out.println(getMaxFromArr(a));

    }
    //1 5 10 7 3
    public static int getMaxFromArr(int[] arr){
        int max= arr[0];        //1
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
}
