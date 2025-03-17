package api.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "안녕하세요";

        // 문자열 길이
        System.out.println("문자열 길이 : " + str.length());
        System.out.println("지정한 위치의 문자 : " + str.charAt(0));
        System.out.println("지정한 위치의 문자 : " + str.charAt(4));
        for (int i = 0; i < str.length(); i++) {
            System.out.print("" + str.charAt(i));
        }
        System.out.println();

        // char 배열로 변환['안','녕']
        char chArr[] = new char[str.length()];
        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(chArr));
        System.out.println(chArr);

        // String => char 배열
        char result[] = str.toCharArray();
        System.out.println(Arrays.toString(result));

        System.out.println("지정한 문자의 문자열 내 위치 : " + str.indexOf("요"));
        System.out.println("지정한 문자의 문자열 내 위치(없을경우 -1) : " + str.indexOf("집"));

        System.out.println("주어진 문자가 문자열에 존재하는 지 여부 : " + str.contains("안"));

        String subject = "자바의 정석";
        String subject2 = "자라와 바다";
        String subject3 = "자 바";

        System.out.println(subject2.indexOf("자바"));
        // 자바 문자가 있으면 자바와 관련있는 책입니다. / 자바와 관련없는 책입니다.
        if (subject2.indexOf("자바") > -1) {
            System.out.println("자바와 관련있는 책입니다.");
        } else {
            System.out.println("자바와 관련없는 책입니다.");
        }

        if (subject2.contains("자바")) {
            System.out.println("자바와 관련있는 책입니다.");
        } else {
            System.out.println("자바와 관련없는 책입니다.");
        }

        // fromIndex : 찾기 시작하는 위치 지정
        System.out.println(str.indexOf("하", 3));
        System.out.println(str.lastIndexOf("하", 3)); // 문자열 끝에서 부터
        String str2 = "java.lang.String";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.lastIndexOf("."));

        String str3 = "java.lang.String";
        System.out.println(Arrays.toString(str3.split("\\.")));
        String arr[] = str3.split("\\.");
        System.out.printf("%s 에 들어간 .의 갯수 : %d", str3, arr.length - 1);

    }
}
