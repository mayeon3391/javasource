package oop;

// private : 외부 클래스에서 접근 불가능 : 멤버 변수에 붙인다
// public : private 의 반대 (접근제한 없음) : 생성자, 메서드에 붙인다

public class Tv3 {
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자
    public Tv3() {

    }

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // setter : 인스턴스 변수 값 변경
    // getter : 인스턴스 변수 사용

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    void upVolume() {
        volume++;
    }

    void downVolume() {
        volume--;
    }

    // 채널 변경, 볼륨 변경, 전원 켜기, 끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }
}
