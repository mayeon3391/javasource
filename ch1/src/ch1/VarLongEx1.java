package ch1;


//  byte : 8비트
// 숫자 표현 : 2의 8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 까지 표현 가능
public class VarLongEx1 {
    public static void main(String[] args) {
        //main(){}== 메소드
        // 변수== 매번 변할 수 있는 값
        // 기본타입 : 정수형, 문자형, 실수형, 불린형
        // 정수형: byte(1), short(2), int(4), long(8)
        //문자형: : char(2)
        //실수형 : float(4), double(8)
        //불린형 : boolean(1)

        // 변수선언 : 타입 변수명 = 값;
        // 변수명 : 단어 2개 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다
        // max-xpeed : 데이터베이스 필드명
        // long : L, l 대소문자 상관 없이 사용 가능하지만 구분을 위해 대문자 사용을 권장

        long age = 15, maxSpeed = 100;
        long max = 256;
        long money = 1000000000000L;

        // 변수값 변경 = 변수의 이름만 불러와서 가능
        // 코드는 무조건 위에서 아래로 실행
        age = 30;


        // System.out.println(age);
        // System.out.println(maxSpeed);
        
        //  + : 산술연산
        //  + : 연결 (문자가 들어가야 이 의미로 쓰여짐)
        System.out.println(money);
        System.out.println("나이: "+age + ", 최고속도: " + maxSpeed + ", max :"+max);
        System.out.println(age + maxSpeed + max);


        
    }
}
