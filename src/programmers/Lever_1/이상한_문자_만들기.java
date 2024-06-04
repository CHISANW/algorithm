package programmers.Lever_1;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        String s=  "try hello world";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isUppercase = true;

        for (char ch : s.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                sb.append(ch);
                isUppercase = true;
            } else {
                sb.append(isUppercase ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
                isUppercase = !isUppercase;
            }
        }

        return sb.toString();
    }
}
