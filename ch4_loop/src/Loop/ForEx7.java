package Loop;

// 중첩 for

// **********
// **********
// **********
// **********
// **********

public class ForEx7 {
    public static void main(String[] args) {

        // 별 * 10 개
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }

        // 이중 for 문(위 코드를 간단히 만든 것)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

    }
}
