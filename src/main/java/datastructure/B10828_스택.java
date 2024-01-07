package datastructure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828_스택 {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            solution(br.readLine());
        }
    }

    private static void solution(String command) throws IOException {
        StringTokenizer st = new StringTokenizer(command);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        switch (st.nextToken()) {
            case "push" :
                int pushNum = Integer.parseInt(st.nextToken());
                stack.push(pushNum);
                break;
            case "pop" :
                if(!stack.isEmpty()){
                    bw.write(stack.pop() + "\n");
                }else {
                    bw.write(-1 + "\n");
                }
                break;
            case "size" :
                bw.write(stack.size() + "\n");
                break;
            case "empty" :
                bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                break;
            case "top" :
                bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
                break;
        }

        bw.flush();
        bw.close();
    }
}
