package Array;

public class ArrayEx14 {
    public static void main(String[] args) {
        // 2차원 배열
        // 타입[][] 배열명 = new 타입[3][3];

        // 값을 알고 있는 경우
        int score[][] = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 }
        };

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("===========================================");

        // int sum;

        // for (int i = 0; i < 5; i++) {
        // System.out.printf("%3d\t", i + 1);

        // sum = 0;

        // for (int j = 0; j < score[0].length; j++) {

        // sum += score[i][j];

        // System.out.print(score[i][j] + "\t");
        // }

        // System.out.print(sum);
        // System.out.println();
        // }

        int korTotal = 0, engTotal = 0, mathTotal = 0; // 과목별 총점

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d\t", i + 1);

            int kin = 0; // 개인별 총점
            float avg = 0.0f; // 개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) {

                kin += score[i][j];
                // 개인별 점수 출력
                System.out.printf("%5d\t", score[i][j]);
            }

            // 개인별 평균 계산 후 출력
            avg = kin / (float) score[i].length;

            System.out.printf("%5d\t%5.1f\n", kin, avg);
        }

        System.out.println("===========================================");
        System.out.printf("총점  :  %3d %3d %3d\n", korTotal, engTotal, mathTotal);

    }
}
