package api.string;

public class StringEx1 {
    public static void main(String[] args) {

        String str1 = new String("안녕하세요");
        String str4 = new String("안녕하세요");
        String str2 = "안녕하세요"; // 더 많이 사용
        String str3 = "안녕하세요"; // 더 많이 사용
        char[] charr = { 'H', 'e', 'l', 'l', 'o' };
        String str5 = new String(charr);
        System.out.println("str5 : " + str5);

        System.out.println(str1 == str4); // 다른 주소
        System.out.println(str2 == str3); // 값은 주소

        // 문자열 비교 : equals()
        System.out.println(str1.equals(str4));

        // 빈 문자열
        str1 = "";
        System.out.println(str1.length());
        str2 = null;
        System.out.println(str2.length());
    }
}
