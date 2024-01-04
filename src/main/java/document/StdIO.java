package document;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StdIO {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());*/

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());*/

        /*StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());*/

        /*int N = 5;
        int M = 5;
        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }*/

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "HELLO";

        bw.write(str);
        bw.newLine();

        bw.write(str + "\n");

        bw.write(str);

        bw.flush();
        bw.close();
    }
}
