package ch1;

// 변수의 유효범위
// {} 안에서 선언된 변수는 {}을 벗어난 곳에서는 사용 불가

public class ScopeEx1 {
    public static void main(String[] args) {

        int a = 100;

        {
            int x = 10;
            System.out.println("x=" + x);
            System.out.println("a="+a);
        }

        // x cannot be resolved to a variable
        // System.out.println("x=" + x);
        System.out.println("a="+a);

        if (a > 200) {
            int sum = 0;
        }
        // System.out.println(sum);

        for (int i = 0; i < args.length; i++) {
            // (int = i){} 뒤에 붙은 중괄호 범위에 한정된다.
        }
        // System.out.println(i);
    }

}
