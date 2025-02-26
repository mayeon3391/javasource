package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        // System.in : 키보드, System.out : 화면
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수 입력");
        // 사용자가 입력한 값을 input 변수에 담기
        // nexrLine() : 무조건 문자열(" ")로 받음
        String input = scanner.nextLine();
        // 입력한 값을 받아와 사용하는 것.

        //  "45" ==> 45 (문자열에서 정수로 바꾸기)
        int num = Integer.parseInt(input);
        // Integer.parseInt = 문자열을 정수(int)로 바꾸는 코드
        System.out.println("입력값 : "+num);

        scanner.close();
    }
}
