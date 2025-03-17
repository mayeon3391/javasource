package api.util;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // int
        List<Integer> list = new ArrayList<>(100);
        // arr[0] = 3;
        // 추가
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(65);
        list.add(75);
        list.add(2, 30);
        System.out.println(list);
        System.out.println(list.size());

        // 조회
        // arr[3]
        System.out.println("특정 위치 요소 조회 : " + list.get(5));
        System.out.println("특정 위치 요소 삭제 : " + list.remove(5));
        System.out.println("특정 위치 요소 삭제 : " + list.remove(Integer.valueOf(30)));
        System.out.println(list);

    }
}
