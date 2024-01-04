package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            System.out.println(solve(br.readLine()));
        }
    }

    private static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (c == '('){
                stack.push(c);
            }
            else {
                if (stack.empty())
                    return "NO";
                else
                    stack.pop();
            }
        }

        if (stack.empty())
            return "YES";
        else
            return "NO";
    }
}
