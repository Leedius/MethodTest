package Method;

public class Method02 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            hello();
            //메소드의 호출은 main메소드에서만 할 수 있는게 아니다!
            tellName();
        }
    }

    //'안녕하세요'를 출력하는 hello라는 메소드 선언
    public static void hello(){
        System.out.println("안녕하세요.");
        tellName();
    }
    public static void tellName(){
        System.out.println("이름은 홍길동입니다.");
    }

}
