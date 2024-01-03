package document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StdIO {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
    }
}
