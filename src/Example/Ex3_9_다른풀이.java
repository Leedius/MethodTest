package Example;

public class Ex3_9_다른풀이 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] result=test3_9(a);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }


    }

    //예시 arr = {1,2,3,4,5}
    //result = {2,4}
    public static int[] test3_9(int[] arr){
        //배열의 크기 구함.
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                cnt++;
            }
        }
        int[] resultArr = new int[cnt];

        int index=0;        //resultArr의 배열의 index를 알기위해서
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                resultArr[index++]=arr[i];
            }
        }
        return resultArr;
    }
}
