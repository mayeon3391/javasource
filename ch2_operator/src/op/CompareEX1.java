package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)
public class CompareEX1 {
    public static void main(String[] args) {
        // \t = tab
        // %b = boolean 값 출력용
        // 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교
        System.out.printf("10 == 10.0f \t %b\n", (10 == 10.0f)); // 10 == 10.0f = 출력문 문자열
        System.out.printf("'0' == 0 \t %b\n", ('0' == 0.0)); // '0'(문자) == 48(유니코드) 냐고 물어본것
        System.out.printf("'A' == 65 \t %b\n", ('A' == 65)); // ('A' == 65) 65 == 65
        System.out.printf("'A' > 'B' \t %b\n", ('A' > 'B')); // 65 > 66
        System.out.printf("'A'+1 != 'B' \t %b\n", ('A' + 1 != 'B')); // 65+1 != 66
    }
}
