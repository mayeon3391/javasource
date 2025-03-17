package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) { // value2 => obj로 들어감
        // return super.equals(obj); 주소비교
        Value v = (Value) obj; // value2(obj)
        return this.value == v.value;
    }

    // toString() : 멤버 변수 값 출력 용도로 재정의
    @Override
    public String toString() {
        return this.value + "";
    }
}
