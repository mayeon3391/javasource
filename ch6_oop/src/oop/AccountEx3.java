package oop;

import java.util.Scanner;

public class AccountEx3 {

    private static Account account[] = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 인스턴스 생성
        // AccountEx2 obj = new AccountEx2();

        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------------");

            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("번호 확인");
                    break;
            }
        }

    }

    private static void createAccount() {
        // new Account("110-11-10100", "홍길동", 1000000);
        // 계좌번호
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();
        // 계좌주
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        // 잔액
        System.out.print("금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < account.length; i++) {
            // for : account[i] 첫번째 만나는 null이면
            if (account[i] == null) {
                account[i] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                // 루프 종료
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("-------------------------------------------");
        System.out.println("계좌 목록");
        System.out.println("-------------------------------------------");

        // 배열출력
        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null) {
        // System.out.printf("%s\t%s\t%d\n", account[i].getAno(), account[i].getOwner(),
        // account[i].getBalance());
        // }
        // }

        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
            }
        }

    }

    private static void deposit() {
        // 예금하다
        // 계좌번호 입력받기 => 사용자가 입력한 계좌번호와 account 의 계좌번호 일치 여부 확인
        // 예금액 입력받기 => 잔액 = 잔액 + 예금액
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();

        Account findAcc = findAccount(ano);
        // findAcc가 널일 때 . 메서드에 접근하면 NullPointerException발생
        if (findAcc != null) {
            System.out.print("예금액 >> ");
            int balance = Integer.parseInt(sc.nextLine());
            findAcc.deposit(balance);
        } else {
            System.out.println("계좌가 없습니다.");
        }

    }

    private static void withdraw() {
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();

        Account findAcc = findAccount(ano);

        if (findAcc != null) {
            System.out.print("출금액 >> ");
            int balance = Integer.parseInt(sc.nextLine());
            findAcc.withdraw(balance);
        } else {
            System.out.println("계좌가 없습니다.");
        }
    }

    private static Account findAccount(String ano) {
        // 입력값 ano와 account 배열 계좌 중에서 일치하는 계좌 찾기
        // Account acc = null;
        for (int i = 0; i < account.length; i++) {
            // 널이 아니어야 하고 account[i].getAno() == ano break;
            if (account[i] != null && account[i].getAno().equals(ano)) {
                return account[i];
            }

            // if (account[i] != null) {
            // if (account[i].getAno().equals(ano)) {
            // return account[i];
            // // break;
            // }
            // }

            // if (account[i] != null) {
            // if(account[i].getAno().equals(ano)){
            // acc = account[i];}
            // break;
            // } //이 경우 acc를 retrun

        }
        return null;
    }

    Scanner close;
}
