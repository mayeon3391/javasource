package Loop;

// continue : 반복문에서만 사용
//            반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여
//            다음 반복으로 넘어감
public class ContinueEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) // 3, 6, 9 출력 X
                continue;
            System.out.println(i);
        }
        // continue는 중단이 아니라 그 이후에 있는 문단을 실행할지 말지를 하는것
    }

}
