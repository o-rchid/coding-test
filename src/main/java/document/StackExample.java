package document;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack.toString());

        // pop: top 반환 후 삭제
        stack.pop();
        // peek: top 값 조회
        stack.peek();
    }
}
