package oop;

public class ReferenceParamEx {
    public static void main(String[] args) {
        int[] x = { 10 };
        System.out.println("main() : x = " + x[0]);
        // 주소복사
        change(x);
        // 값복사
        change2(x[0]);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println("chang(0) : x " + x[0]);
    }

    static void change2(int x) {
        x = 1000;
        System.out.println("chang2(0) : x " + x);
    }
}
