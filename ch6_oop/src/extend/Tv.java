package extend;

// Tv 클래스 이용해서 Tv(인스턴스) 생성
// 객체 구성요소
// 1. 속성(특성) => 멤버 변수
// 2. 기능(동작-) => 멤버 메소드
public class Tv {

    int channel;
    boolean power;

    // 채널 변경, 볼륨 변경, 전원 켜기, 끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
