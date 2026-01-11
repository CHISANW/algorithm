package programmers.level_2;

public class solve_12951 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isStart = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                sb.append(c);
                isStart = true;
            } else {
                if (isStart) {
                    sb.append(Character.toUpperCase(c));
                    isStart = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        return sb.toString();
    }
}
