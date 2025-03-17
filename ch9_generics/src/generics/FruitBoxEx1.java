package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }

}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }

}

class Box3<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    public ArrayList<T> geList() {
        return list;
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx1 {

    // Comparator<String> c;

    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();

        // 상속 관계 시 부모타입으로 제네릭스를 선언하면 모든 자식을 담을 수 있음
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        // appleBox.add(new Fruit()); 자식클래스에 부모대입은 불가능
        // appleBox.add(new Grape()); 형제관계같은건 없다

        toyBox.add(new Toy());

        grapeBox.add(new Grape());

        // sort대상리스트, Collector<? super Apple> c
        // <? super Apple> : Apple 클래스 + 부모(Fruit, Object)
        List<Apple> list = new ArrayList<>();
        Collections.sort(list, null);
    }
}
