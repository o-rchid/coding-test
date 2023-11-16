import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        int[] stoneDisabilities = {5, 3, 4, 1, 3, 8, 3};
        Dog[] dogs = {
                new Dog("루비독", "95년생", 3, 4),
                new Dog("피치독", "95년생", 3, 3),

                new Dog("씨-독", "72년생", 2, 1),
                new Dog("코블독", "59년생", 1, 1),

        };
        solution(stoneDisabilities, dogs);
    }

    public static void solution(int[] stoneDisabilities, Dog[] dogs) {
        ArrayList<String> answer = new ArrayList<String>();

        for (Dog i : dogs) {
            int dogLoc = 0;
            boolean flag = true;

            while (dogLoc < stoneDisabilities.length) {
                dogLoc += i.jumpingAbility;

                if (dogLoc > stoneDisabilities.length)
                    break;

                stoneDisabilities[dogLoc - 1] -= i.weight;

                if (stoneDisabilities[dogLoc - 1] < 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                answer.add(i.name);
        }
        System.out.println(answer);
    }
}

