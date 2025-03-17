package api.string;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println("AB 문자열 횟수 : " + count("12345AB12AB345AB", "AB"));
        System.out.println("AB 문자열 횟수 : " + count("12345", "AB"));
    }

    public static int count(String src, String target) {
        int cnt = 0;
        for (int i = 0; i < src.length(); i++) {
            if (src.indexOf(target, i) > -1) {
                cnt += 1;
                i = src.indexOf(target, i);
            }
        }
        return cnt;
    }
}
