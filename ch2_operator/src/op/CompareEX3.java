package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <, >, <=, >=
 // 등가비교 : ==(equal), !=(not equal)

// 문자열 : "a", "abc" 

public class CompareEX3 {
    public static void main(String[] args) {
        // 변수선언 : 기본타입(ch1-VaeByteEx1 참조)
        // 문자열(매우중요)은 기본타입으로 선언하지 않는다. 객체타입으로 선언
        // 문자열의 시작은 대문자로 시작

        // 자바에서 문자열을 선언할 때 2가지 방식을 허용
        // 직접 넣는 방식, new로 주는 방식
        // 기본적인 방법은 new

        String str1 = "abc"; 
        String str2 = "abc";
        // str1, str2 모두 같은 곳(스트링 pool)을 가리키고 있음
        String str3 = new String("abc");
        // str3은 heap에 따로 저장되어 다른 곳을 가리킴(new로 넣어서)

        // str1(=str2) 을 저장하는공간과 str3 을 저장하는 공간이 다름
        // 같은 공간에서 저장된 문자열 비교시 == 을 사용(값 비교)하면 true (재사용)
        // 다른 공간에서 저장된 문자열 비교시 == 을 사용(주소 비교)하면 false

        System.out.printf("str1 == str2 = %b\n",(str1 == str2)); // true
        System.out.printf("str1 == str3 = %b\n",(str1 == str3)); // false
        // 문자열 비교 == 대신에, equls() or equlsIgnoreCase()를 사용
        // abc == ABC : false
        // equlsIgnoreCase : 대소문자 구분 없이 비교해줌
        System.out.printf("str1 == equals(str3) = %b\n",(str1.equals(str3)));
        System.out.printf("str1 == equals(ABC) = %b\n",(str1.equals("ABC")));
        System.out.printf("str1 == equals(str3) = %b\n",(str1.equalsIgnoreCase(str3)));
        System.out.printf("str1 == equals(ABC) = %b\n",(str1.equalsIgnoreCase("ABC")));
        // 문자열을 비교할 때엔 안전하게 비교하자.
        // 문자열을 비교할 땐 ==  사용하지 않기
        
        
    }
}
