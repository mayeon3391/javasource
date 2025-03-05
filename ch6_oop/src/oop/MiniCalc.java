package oop;

// 메서드 종류

// 1. 인스턴스 메서드 : 클래스 영역 / 인스턴스가 생성되었을 때 (new Card()를 해야 생성)
// 2. 클래스 메서드 : 클래스 영역 / 클래스가 메모리에 올라갔을 때 (클래스 작성이 완료되면 바로 생성)

// 같은 클래스 내에서 다른 메소드 호출 가능 - 이름사용
// 같은 클래스 내에서는 이름만 사용해서 호출이 가능, 단 static이 붙으면 안됨
// static - non-static : 생성되는 시기가 다르기 때문에 호출 시점을 따져야함

// non-static : statcic, non-static 상관없이 사용가능

public class MiniCalc {

    static int k;
    int a, b;

    // 클래스 메서드
    static void print() {
        // plus(), avg(), execute(), println() 호출 불가 => 호출하려면 new MiniCalc() 한 후(잘 안 함)
        // this.a = 7; => 호출하려면 new MiniCalc() 한 후
        k = 45;
    }

    // static이 안 붙은 애들 - 내부에서는 이름만 써서 부른다
    int plus(int x, int y) {
        this.a = 7;
        k = 45;
        print();
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y); // 생성 시기가 같아서 이름만 써서 불러와짐
        return sum / 2;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행 결과 : " + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }

}
