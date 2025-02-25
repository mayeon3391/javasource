package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 실수형 : float , double
        // 소수점 형태의 숫자를 사용하면 무조건 double로 인식함
        // float(4byte) = double(8byte) ==> X
        // float 타입은 f, F 를 붙임
        float score1 = 90.14f;
        // double 타입도 d,D를 붙임
        // double 타입이 정밀도가 더 높음
        // java에선 기본적으로 소수점은 double로
        double score2 = 98.5d;
        System.out.println("score1 = "+score1);
        System.out.println("score2 = "+score2);
        System.out.printf("score2 = %.2f\n",score2);//.2=소숫점 둘째 자리까지만 표시
    }
    
}
