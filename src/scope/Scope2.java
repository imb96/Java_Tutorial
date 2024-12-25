package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m);  // 블록 내부에서 외부접근 가능
            System.out.println("for x = " + i);
        } // i 소멸

//        System.out.println("main i = " + i);
        System.out.println("main m = " + m);
    }
}
