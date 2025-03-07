package extend; // (1) 폴더

import java.util.Scanner; // (2) 패키지명.클래스명

public class AccountEx { // (3)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CheckingAccount 의 생성자를 무조건 호출
        // 부모의 인스턴스도 같이 생성됨
        CheckingAccount cAccount = new CheckingAccount("110-11", "hong", 100000, "123-1232");

        System.out.println("계좌번호 : " + cAccount.getAno()); // null
        System.out.println("계좌주 : " + cAccount.getOwner()); // null
        System.out.println("잔액 : " + cAccount.getBalance()); // 0
        System.out.println("체크카드 번호 : " + cAccount.getCardNo()); // null

        try {
            // cardNo나 잔액을 확인해주세요
            // System.out.println("현재잔액 : " + cAccount.pay("453", 100));
            System.out.println("현재잔액 : " + cAccount.pay("123-1232", 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // CreditLineAccount
        CreditLineAccount cLineAccount = new CreditLineAccount("110-11", "hong", 100000, 3000000);
        try {
            // cLineAccount.withdraw(3500000);
            cLineAccount.withdraw(2500000);
            System.out.println("현재잔액 : " + cLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BonusPointAccount
        BonusPointAccount bonusPointAccount = new BonusPointAccount("110-11", "hong", 100000, 0);
        bonusPointAccount.deposit(100000);
        System.out.println("보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("110-11", "hong", 100000, "123-1232",
                false);
        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("110-11", "hong", 100000,
                "123-1232", true);
        try {
            System.out.println("교통카드 지불 후 현재 잔액 : " + checkingTrafficAccount2.payTrafficCard("123-1232", 1750));
            System.out.println("현재 잔액 : " + checkingTrafficAccount.payTrafficCard("123-1232", 1750));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
