package ch1;

public class VarcharEx1 {
    public static void main(String[] args) {
        // 문자 : 글자 한 개 => 'a', '미',' ' (공백도 문자)
        // 문자열 : 글자 한 개 ~ 여러 개 => "미", "a". "abc", "대한민국", " " (공백도 문자열)
        // 둘의 차이는 ' '이냐 " "이냐의 차이
        // 문자는 무조건 코드로 변경 = unicode (약속된 숫자)
        // 문자보단 문자열을 더 많이 쓴다

        // 기라는 문자를 ch1에 대입
        char ch1 = '기';

        // ch1의 값을 unicode 변수에 대입
        // int = char
        int unicode = ch1;
        System.out.println("ch1 = "+ch1);
        System.out.println("unicode = "+unicode); //'기' 문자의 unicode 값 44592

        char ch2 = 'a';
        unicode = ch2;
        System.out.println("ch2 = "+ch2);
        System.out.println("unicode = "+unicode); // 'a' 문자의 unicode 값 97

        char ch3 = 'A';
        unicode = ch3;
        System.out.println("ch3 = "+ch3);
        System.out.printf("ch3 = %c\n",ch3);
        System.out.println("unicode = "+unicode); //'A' 문자의 unicode 값 65



    }
}
