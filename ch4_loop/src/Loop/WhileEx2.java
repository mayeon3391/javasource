package Loop;

// 반복문 - for, while, do~while (for를 가장 많이 사용)
// 반복적으로 실행해야하는 코드를 간단히 처리

// 안녕하세요 10번 출력

public class WhileEx2 {
    public static void main(String[] args) {

        int i = 1;
        while (i<11) {
            System.out.println(i + "   ");
            i++;
        }
        System.out.println();

        // 10~1
        while (i>0) {
            System.out.println(i + "   ");
            i++;
        }
        System.out.println();

        // 짝수만 출력 1~10
        while (i < 11) {
            System.out.println(i + "   ");
            i++;
        }
        System.out.println();

        // i가 짝수이면 출력
        while (i < 11) {
            System.out.println(i + "   ");
            i++;
        }
        
        System.out.println();

        // i += 2 : i = i + 2
        i = 2;
        while (i < 11) {
            i++;
        }
        
        System.out.println();
    }
}
