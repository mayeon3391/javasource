package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("String 숫자 => int " + Integer.parseInt("10"));
        System.out.println("int => String 숫자 " + i.toString());
        System.out.println("큰 수(5,8)   : " + Integer.max(5, 8));
        System.out.println("작은 수(5,8) : " + Integer.min(5, 8));

        // int ==> Integer
        // Integer ==> int
    }
}
