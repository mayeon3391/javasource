package Loop;

// 반복문 - for, while, do~while (for를 가장 많이 사용)
// 반복적으로 실행해야하는 코드를 간단히 처리

// 안녕하세요 10번 출력

public class ForEx3 {
    public static void main(String[] args) {

        // 1~10 까지의 합
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            
            // sum = sum + i;
            sum += i;
        }
        System.out.println("1~10 까지의 합"+sum);

        // 1~100까지의 수 중에서 3의 배수 출력
        // i % 3 == 0

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
