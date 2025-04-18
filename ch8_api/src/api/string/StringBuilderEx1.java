package api.string;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        String str1 = "안녕하세요";
        str1 += " 반갑습니다.";
        str1 += " 저는 홍길동입니다.";
        // Stirng은 원본 문자열 변경 불가이기 때문에 매번 기존의 메모리를 해제하고 재생성

        // StringBuffer sb = "안녕하세요"; => (x)
        StringBuffer sb = new StringBuffer("안녕하세요");
        sb.append(" 반갑습니다.").append(" 저는 홍길동입니다.");

        // String equals 확인
        String str2 = new String("Hello");
        String str3 = new String("Hello");
        System.out.println(str2.equals(str3) ? "문자열 같음!" : "문자열 다름..");

        // StringBuffer equals 확인 - 부모가 상속해준 그대로 사용중
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1.equals(sb2) ? "문자열 같음.." : "문자열 다름!");

        // Stinrg equals 사용하기 위해 변환
        String obj1 = sb1.toString();
        String obj2 = sb2.toString();
        String obj3 = new String(sb1);
        String obj4 = new String(sb2);
        System.out.println(obj1.equals(obj2) ? "문자열 같음.." : "문자열 다름!");
        System.out.println(obj3.equals(obj4) ? "문자열 같음~" : "문자열 다름?");

        // 거꾸로 출력 charAt(30)
        System.out.println(str1);
        for (int i = str1.length() - 1; i >= 0; i--) {
            // System.out.print(i);
            System.out.print("" + str1.charAt(i));
        }

        System.out.println("\n" + sb.reverse());
        System.out.println();

        StringBuffer sb3 = new StringBuffer(str1);
        System.out.println(sb3.reverse());

        // delete(), insert()
        System.out.println(sb2.delete(1, 3)); // 1~2 H'el'lo
        sb2.deleteCharAt(2); // Hl'o'
        System.out.println(sb2);
        System.out.println(sb2.insert(2, "llo"));

        // replace()
        System.out.println("" + sb1.replace(0, 4, "Ronald")); // 0~3 원본 바꾸기

    }
}
