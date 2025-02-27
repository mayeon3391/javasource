package Loop;

public class ForEx5 {
    public static void main(String[] args) {
        // 1) 3의 배수의 총 합 출력
        // i % 3 == 0
        int a = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                a += i;
            }
        }
        System.out.printf("1~100사이 3의 배수의 총 합 : " + a);

        // 2) 3의 배수는 더하고 9의 배수는 뺀 합 출력
        a = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                a += i;
            }
        }
        System.out.printf("1~100사이 3 배수이지만 9의 배수는 아닌 수의 총합 : " + a);

        // 3) 3의 배수와 5의 배수 총합 출력
        a = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                a += i;
            }
        }
        System.out.printf("1~100사이 3 배수 또는 5의 배수 총합 : " + a);
    }
}
