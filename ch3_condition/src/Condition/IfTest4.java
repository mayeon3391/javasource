package Condition;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        // score 점수를 입력받아
        // score >= 90  등급은 A 입니다. : if()
        // score <= 80 등급은 B 입니다. : elseif()
        // score <= 70 등급은 C 입니다. : elseif()
        // score <= 60 등급은 D 입니다. : elseif()
        // score < 60 등급은 F 입니다. : else
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        if (score >= 90) {
        
            System.out.println("등급은 A 입니다.");
        } 
        
        else if (score >= 80) {
            System.out.println("등급은 B 입니다.");
        }
        
        else if (score >= 70) {
            System.out.println("등급은 C 입니다.");
        }
        
        else if (score >= 60) {
            System.out.println("등급은 D 입니다.");
        }
        
        else {
            System.out.println("점수가 60점 미만입니다");
            System.out.println("등급은 F 입니다.");
        }
        // else 옆에는 조건이 못 옴 if 외 모든 예외를 담당
        scanner.close();
        }
    }
