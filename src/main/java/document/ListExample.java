package document;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // add
        list.add("one");
        list.add("two");
        list.add("three");

        list.forEach(s -> System.out.println(s));

        // get: 특정 인덱스 값 조회
        list.get(2);

        // remove: 특정 객체/인덱스 값 삭제
        list.remove("three");
        list.remove(2);

        // contains
        list.contains("one");

        // size
        list.size();
    }
}
