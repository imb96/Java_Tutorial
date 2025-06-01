package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 사용자로부터 문자열 입력 받기
        System.out.println("입력한 문자열: " + str); // 입력한 문자열 출력

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue); // 입력한 정수 출력

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue); // 입력한 실수 출력
    }
}
