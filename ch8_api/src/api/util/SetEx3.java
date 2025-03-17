package api.util;

import java.util.HashSet;
import java.util.Set;

import api.object.Person;

public class SetEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        Set<Person> set = new HashSet<>();
        set.add(new Person("재림", "임동재"));
        set.add(new Person("선진", "윤성인"));
        set.add(new Person("마가", "서정윤"));
        set.add(new Person("세와", "한창민"));
        set.add(new Person("재림", "임동재"));
        set.add(new Person("긍휼", "이준서"));

        for (Person person : set) {
            System.out.println(person); // person.toString()
        }

        System.out.println(new Person("hong12", "홍길동").hashCode());
        System.out.println(new Person("hong12", "홍길동").hashCode());
    }
}
