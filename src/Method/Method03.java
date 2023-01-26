package Method;

public class Method03 {
    public static void main(String[] args) {
        tellAge(20);
        tellAge(30);

        //메소드를 호출할 떄는
        //메소드명이 같아야 하고, 매개변수의 정보도 같아야함.
        //매개변수의 정보 : 자료형, 매개변수의 개수,
        //tellAge("java");      자료형 불일치 오류!
        //tellAge();            매개변수의 개수가 불일치 오류!

        tellInfo("홍길동",20);
    }

    //int age : 매개변수
    public static void tellAge(int age){
        System.out.println("나이는 " + age);
    }

    public static void tellInfo(String name, int age){
        System.out.println("이름은 " + name);
        System.out.println("나이는 " + age);
    }

}
