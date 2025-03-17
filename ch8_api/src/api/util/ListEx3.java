package api.util;

import java.util.ArrayList;
import java.util.List;

import api.object.Person;

public class ListEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        List<Person> list = new ArrayList<>();
        list.add(new Person("재림", "임동재"));
        list.add(new Person("선진", "윤성인"));
        list.add(new Person("마가", "서정윤"));
        list.add(new Person("세와", "한창민"));
        list.add(new Person("긍휼", "이준서"));

        for (Person person : list) {
            System.out.println(person); // person.toString()
        }

        // 아이디 이름
        // -----------------------
        // hong12 홍길동
        System.out.println();
        System.out.println("아이디\t\t이름");
        System.out.println("-------------------------");
        for (Person person : list) {
            System.out.printf("%s\t\t%s\n", person.getId(), person.getName());

        }
    }
}
