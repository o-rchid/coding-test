package document;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //offer: 큐 뒤에 데이터 삽입,
        //큐가 꽉 찼을 경우 add 는 예외 발생, offer 는 false 반환
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");


        //poll: 큐의 맨 앞에 위치한 값 반환 후 삭제
        queue.poll();
        //peek: 큐의 맨 앞에 위치한 값을 반환
        queue.peek();
    }
}
