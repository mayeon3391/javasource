package Condition;

import java.util.Scanner;

public class IfTest9 {
    public static void main(String[] args) {
        // 운년, 평년 구하기
        // 년도를 입력받고

        // 입력받은 년도가 윤년인지 평년인지 출력
        // 운년 : 년도로 4로 나눈 나머지가 0 이고, 년도를 100으로 나눈 나머지가 0이 아니면
        //        or 년도를 400으로 나눈 나머지가 0이면

    

        Scanner scanner = new Scanner(System.in);
            System.out.println("년도를 입력하시오");
            String input = scanner.nextLine();
            int years = Integer.parseInt(input);

            
            if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0 ) {
                System.out.println("윤년");
            } else {
                System.out.println("평년");
            }
    }
}
