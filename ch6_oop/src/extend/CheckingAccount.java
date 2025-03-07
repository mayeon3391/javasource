package extend;

public class CheckingAccount extends Account {
    // 은행계좌 + 체크카드
    private String cardNo;

    // public CheckingAccount(){
    // // 부모의 default 생성자 호출
    // super();
    // }

    public CheckingAccount(String ano, String owner, long balance, String cardNo) {
        super(ano, owner, balance); // super = 부모
        this.cardNo = cardNo; // this = 자신
    }

    // 비용(체크카드 사용액) 지불
    // 사용한 카드번호와 체크카드 번호 일치여부 확인
    // 잔액 > 사용액
    long pay(String cardNo, int amount) throws Exception {
        if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
            throw new Exception("cardNo나 잔액을 확인해주세요");
        }
        // 비용 지불 : 잔액 = 잔액 - 사용액;
        withdraw(amount);
        // 잔액 반환
        return getBalance();
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

}
