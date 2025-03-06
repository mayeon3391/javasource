package oop;

// Singleton : 객체를 하나만 만들어서 사용하는것

public class Singleton {

    private static Singleton singleton = new Singleton();

    // 생성자
    private Singleton() {
    }

    static Singleton getISingleton() {
        return singleton;
    }

}
