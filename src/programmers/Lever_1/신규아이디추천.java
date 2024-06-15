package programmers.Lever_1;

public class 신규아이디추천 {
    public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));

        String new_id1 = "z-+.^.";
        System.out.println(solution(new_id1));

        String new_id2 = "123_.def";
        System.out.println(solution(new_id2));
    }

    public static String solution(String new_id) {
        String one = new_id.toLowerCase();

        StringBuilder step2 = new StringBuilder();
        for (char c : one.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || c == '-' || c == '_' || c == '.') {
                step2.append(c);
            }
        }

        String step3 = step2.toString().replaceAll("\\.+", ".");

        String step4 = step3;
        if (step4.startsWith(".")) {
            step4 = step4.substring(1);
        }
        if (step4.endsWith(".")) {
            step4 = step4.substring(0, step4.length() - 1);
        }

        if (step4.isEmpty()) {
            step4 = "a";
        }

        if (step4.length() >= 16) {
            step4 = step4.substring(0, 15);
            if (step4.endsWith(".")) {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }

        while (step4.length() < 3) {
            step4 = step4 + step4.charAt(step4.length() - 1);
        }

        return step4;
    }
}
