package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child(); // 오버라이팅 된 메소드가 있다면 오버라이딩된 메소드가 실행된다

        // child1.method1();
        // child1.method2();
        // child1.method3();

        // parent 접근 범위
        // parent,field1;
        parent.method1(); // parent method1()
        parent.method2(); // Child method2()

        // The method method3() is undefined
        // parent.method3();

        // method3 사용
        // 부모 = 자식 (O)
        Child child2 = (Child) parent;
        child2.method3();

        // java.lang.ClassCastException: class poly.Parent
        // 자식 = 부모 (X)
        Parent parent2 = new Parent();
        child2 = (Child) parent2;
        child2.method3();
    }
}
