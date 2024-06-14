package programmers.level_2;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                result.append(c);
                capitalize = true;
            } else {
                if (capitalize) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                capitalize = false;
            }
        }

        return result.toString();
    }
}
