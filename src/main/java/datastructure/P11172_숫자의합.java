package datastructure;

import java.util.Scanner;

public class P11172_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < sNum.length(); i++) {
            sum += cNum[i] - '0';
        }

        System.out.println(sum);
    }
}
