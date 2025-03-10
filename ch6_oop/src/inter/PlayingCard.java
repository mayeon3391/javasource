package inter;

public interface PlayingCard {

    // 멤버변수 가질 수 없음
    // boolean pause; X

    // 상수(주로 대문자로 선언)의 형태로만 가질 수 있음
    public static final int SPADE = 4;
    // public static final 생략 가능
    int CLOVER = 1;

    // 일반메서드 가질 수 없음
    // void pause() {} X

    // 추상메서드만 가진다
    // public abstract 생략가능
    void pause();

    // static, difault가 붙는다면 일반메소드도 허용
    static void display() {
    }

    default void print() {
    }
}
