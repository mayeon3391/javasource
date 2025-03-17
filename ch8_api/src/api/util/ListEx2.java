package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 요소추가
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("과일 : ");
            String in = sc.nextLine();
            if (in.equals("q"))
                break;
            else
                list.add(in);
        }

        System.out.println(list);

        System.out.println("index를 이용한 제거 : " + list.remove(1));
        System.out.println("아이템 제거 : " + list.remove("감"));

        for (String str : list) {
            System.out.printf("%s \n", str);
        }
        System.out.println("찾으려는 과일 : ");
        String in = sc.nextLine();
        if (list.contains(in)) {
            System.out.println("있음");
            System.out.println("해당과일의 포함 위치 : " + list.indexOf(in));
        } else
            System.out.println("없음");

        // int[] arr = {}
        // 배열 => 리스트 변환
        // Arrays : 배열에 필요한 유용한 메서드 제공
        String strArr[] = { "사과", "포도", "메론", "수박", "참외", "바나나", "자두" };
        List<String> list2 = Arrays.asList(strArr);
        System.out.println("조회 : " + list2.get(3));
        // UnsupportedOperationExcepion
        // System.out.println("삭제 : " + list2.remove(3));
        // list2.add("딸기");

        // 배열 => 리스트 변환(조회 + 변경)
        List<String> list3 = new ArrayList<>(Arrays.asList(strArr));
        list3.add("딸기");
        list3.remove(3);

        // 리스트 => 배열
        Object[] arrrr = list3.toArray();
        System.out.println(Arrays.toString(arrrr));
    }
}
