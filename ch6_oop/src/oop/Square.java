package oop;

public class Square {
    // 정사각형
    // 속성 : 길이 (sideLength)
    // 기능 : 면적 구하기
    // 생성자, toString

    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public Square() {
    }

    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + "]";
    }

    int getArea() {
        return sideLength * sideLength;
    }
}
