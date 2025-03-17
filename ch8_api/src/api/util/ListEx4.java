package api.util;

import java.util.LinkedList;
import java.util.List;

public class ListEx4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("사과");
        list.add("키위");
        list.add("감");
        list.add("귤");
        list.add("복숭아");
        list.add("수박");
        list.add("포도");

        for (String string : list) {
            System.out.println(list);
        }

        System.out.println(list.get(3));
        System.out.println(list.remove(3));
        System.out.println(list.indexOf("복숭아"));

    }
}
