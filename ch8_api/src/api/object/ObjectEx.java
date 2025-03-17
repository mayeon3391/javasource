package api.object;

public class ObjectEx {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        // 둘 다 주소값을 비교 (같은 인스턴스를 가리키는 지)
        System.out.println(object1.equals(object2) ? "같음" : "다름");
        System.out.println(object1 == object2 ? "같음" : "다름");
        // Object toString() java.lang.Object@5ca881b5
        System.out.println("Object toString() " + object1.toString());

        Value value1 = new Value(10);
        Value value2 = new Value(10);

        System.out.println("Value toString() : " + value1.toString());
        // 부모가 상속 시 참조변수의 주소값 비교
        System.out.println(value1.equals(value2) ? "value1 == value2" : "value1 != value2");
        // 주소값이 아닌 내부의 값을 비교하기 위해선 String 사용
        // 멤버 변수의 값 비교 equals 재정의 (equals를 오버라이딩)

        Person p1 = new Person("hong123", "홍길동");
        Person p2 = new Person("hong123", "홍길롱");

        System.out.println("p1 toString() : " + p1.toString());
        System.out.println(p1.equals(p2) ? "p1 == p2" : "p1 != p2");

    }
}
