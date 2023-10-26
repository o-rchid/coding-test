/*섬으로 향하라!

        '   + -- + - + -   '
        '   + --- + - +   '
        '   + -- + - + -   '
        '   + - + - + - +   '

        해(1)와 달(0),
        Code의 세상 안으로!(En-Coding)*/

public class Q1 {
    public static void main(String[] args) {
        String[] text = {
                "   + -- + - + -   ",
                "   + --- + - +   ",
                "   + -- + - + -   ",
                "   + - + - + - +   "
        };
        solution(text);
    }

    private static void solution(String[] text) {
        for (int i = 0; i < text.length; i++) {
            int n = Integer.parseInt(text[i].strip().replace(" ","")
                    .replace("+", "1").replace("-","0"), 2);
            text[i] = String.valueOf((char) n);
            System.out.print(text[i]);
        }
    }
}
