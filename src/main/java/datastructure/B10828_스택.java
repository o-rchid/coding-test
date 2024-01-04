package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B10828_스택 {

    static List<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            solution(br.readLine());
        }
    }

    private static void solution(String command) {
        StringTokenizer st = new StringTokenizer(command);

        switch (st.nextToken()) {
            case "push" :
                int pushNum = Integer.parseInt(st.nextToken());
                stack.add(pushNum);
                break;
            case "pop" :
                if(!stack.isEmpty()){
                    Integer popNum = stack.remove(stack.size() - 1);
                    System.out.println(popNum);
                }else {
                    System.out.println(-1);
                }
                break;
            case "size" :
                System.out.println(stack.size());
                break;
            case "empty" :
                if(stack.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
                break;
            case "top" :
                if(!stack.isEmpty()){
                    Integer popNum = stack.get(stack.size() - 1);
                    System.out.println(popNum);
                }else {
                    System.out.println(-1);
                }
                break;
        }
    }
}
