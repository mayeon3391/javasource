package Loop;

// * 
// **
// ***
// ****
// *****

public class ForEx10 {
    public static void main(String[] args) {
        // * 을 출력할 라인의 수 입력받기
        // 입력받은 값 만큼 출력받기

        for (int i = 5; i > 0; i--) {
            if (i > 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }

        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            if (i > 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }

        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            if (i > 3) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }

        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            if (i > 4) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }

        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            if (i > 5) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }

        }
        System.out.println("\n\n");

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                // if (j > i) {
                // System.out.print(" ");
                // } else {
                // System.out.print("*");
                // }
                System.out.print(j > i ? " " : "*");
            }
            System.out.println();

        }
        // for (int i = 1; i < num + 1; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

    }
}
