package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // 생존 시작
        if (true) {
            int x = 20; // 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 소멸
//        System.out.println("main x = " + x); //
        System.out.println("main x = " + m); // 컴파일 에러
    } // m 소멸
}
