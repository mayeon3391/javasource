package op;

public class ArthmeticEx1 {
    public static void main(String[] args) {
        //변수 선언 - int a, b
        int a =10, b =4;

        // +, -, *, /(Java에서 정수의 나누기 값은 소수점은 제외하고 몫만 처리해준다)
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        // 소수점 float, dauble
        // a/(float)b == 10/4.000000
        // a(int) / b(float) : 타입이 다른 경우 연산 시 큰 쪽으로 변환이 일어남
        System.out.printf("%d / %f = %f\n", a, (float)b, a/(float)b);
         
    }
}
