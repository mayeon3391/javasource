package Condition;

import java.util.Scanner;

public class SwichTest5 {
    public static void main(String[] args) {
        // 점수(0~100)입력받은 후 점수에 따라 등급 출력
        // 90 이상이면 A, 80 B, 70 C, F

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수입력");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A입니다");
                break;
            case 8:
                System.out.println("B입니다");
                break;
            case 7:
                System.out.println("C입니다");
                break;

            default:
                System.out.println("F입니다");
                break;
        }
    }
}
