package Loop;

public class WhileEx4 {
    public static void main(String[] args) {
        // 구구단 출력

        int n = 7;

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, (n * i));
        }

        for (int i = 1; i < 10; i++) {
            System.out.printf("2 * %d = %d\n", i, (2 * i));
        }

        int i = 1;
        while (i < 10) {
            System.out.printf("7 * %d = %d\n", i, (7 * i));
            i++;
        }

        i = 1;
        while (i < 10) {
            System.out.printf("2 * %d = %d\n", i, (2 * i));
            i++;
        }
    }
}
