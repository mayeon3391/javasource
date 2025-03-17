package api.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Tod", "Kim", "Lee", "Choi" };

        String result = obj.findKimL(names);

        System.out.println(result);
    }

    // 배열 형태로 찾기
    public String findKim(String[] seoul) {
        int k = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].contains("Kim"))
                k = i + 1;
        }
        return "Kim은 " + k + "번째에 있다.";

    }

    // 리스트 형태로 바꿔서 찾기
    public String findKimL(String[] seoul) {
        List<String> list = new ArrayList<>(Arrays.asList(seoul));
        int k = list.indexOf("Kim");
        return "Kim은 " + (k + 1) + "번째에 있다.";

    }
}
