package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        //변수 선언 - int a, b
        byte a =10, b =4;
        // byte, short 타입으로 연산시 연산의 결과가 int 타입으로 변환이 일어남
        // byte c = a + b;
        // 해결책 1) 변수 c를 int로 만든다
        // int c = a+ b;

        // 해결책 2) byte로 강제연산 (결과값이 -128 ~ 127 사이라면 가능)
        byte c = (byte)(a + b);
         
    }
}
