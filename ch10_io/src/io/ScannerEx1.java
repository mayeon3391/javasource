package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력
        // 1) InputStream
        // 2) Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 ");
        int num1 = sc.nextInt(); // 5 엔터 중 5만 가져감
        System.out.println("연산자 입력 (+,-,*,/)");
        // String op = sc.nextLine : 줄 단위로 읽음 그래서 엔터까지 읽어 건너뛰고 숫자입력이 나옴
        String op = sc.next();
        System.out.println("숫자 입력 ");
        int num2 = sc.nextInt();

        // 숫자 입력
        // 5 엔터
        // 연산자 입력 (+,-,*,/)
        // 숫자 입력

        // sc.next();
    }
}
