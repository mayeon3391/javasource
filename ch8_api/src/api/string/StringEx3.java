package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String str = "Hello";
        // 문자열 연결 : +
        str += " World!!";

        System.out.println(str);

        // concat() : 문자열을 뒤에 붙인다.
        String str2 = "안녕하세요";
        str2 = str2.concat(" 반갑습니다");
        System.out.println(str2);

        // endsWith(), startsWith()
        System.out.println("지정된 문자열로 종료 여부(습니다) : " + str2.endsWith("습니다"));
        System.out.println("지정된 문자열로 종료 여부(안녕)) : " + str2.startsWith("안녕"));

        String file = "test.txt";
        // 이미지 : png , gif , jpg
        if (file.endsWith("png") || file.endsWith("gif") || file.endsWith("jpg"))
            System.out.println("이미지 형식의 파일입니다.");
        else
            System.out.println("이미지 형식의 파일이 아닙니다.");

        // replace(), replaceAll(), replaceFirst()
        // replace() : 결과를 새로운 문자열로 반환
        System.out.println("replace(old,new) : " + str.replace("Hello", "Hi,"));
        System.out.println(str); // Hello World!!
        // 원본 자체를 변경
        str = str.replace("Hello", "Hi,");
        System.out.println(str); // Hi, World!!

        // replaceAll() - 정규식 사용가능
        System.out.println(str.replaceAll("[a-z]", "1")); // Hi, World!! -> H1, W1111!!

        str2 = "Hellollo";
        System.out.println(str2.replaceFirst("llo", "")); // Hellollo -> Hello
        System.out.println(str2);

        // substring() : 새로운 문자열 반환
        str2 = "java.lang.Object";
        System.out.println(str2.substring(10)); // Object
        // 끝 위치는 포함하지 않음
        System.out.println(str2.substring(10, 15)); // Objec

        // split()
        str2 = "dog,cat,bear";
        System.out.println(Arrays.toString(str2.split(",")));
        String arr[] = str2.split(",", 2); // 지정된 숫자만큼 분리
        for (String string : arr) {
            System.out.println(string);
        }

        // 대문자 / 소문자 변경
        str2 = "HeLlO";
        System.out.println("소문자로 인사하기 " + str2.toLowerCase());
        System.out.println("대문자로 인사하기 " + str2.toUpperCase());

        // trim() : 양쪽 끝에 있는 공백 제거
        String str3 = "       Hello World        ";
        System.out.println(str3);
        System.out.println(str3.trim());

        // valueOf() : 문자열로 반환, static (String으로 시작, 변수명x)
        int i = 5;
        String str4 = String.valueOf(i); // "5" 숫자가 문자로 변경
        str4 = i + ""; // 사실 이렇게 해도 됨

    }
}
