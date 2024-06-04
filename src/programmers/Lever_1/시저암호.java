package programmers.Lever_1;

public class 시저암호 {
    public static void main(String[] args) {
//        String s = "AB";
//        int n = 25;
//        System.out.println(solution(s,n));      //"BC"

//        String s1 = "z";
//        int n1 = 1;
//        System.out.println(solution(s1,n1));    //"a"
//
        String s3 = "a B z";
        int n3 = 4;
        System.out.println(solution(s3,n3));    //"e F d"
    }

    public static String solution(String s,int n) {

        char[] cmd = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : cmd) {
            if (c != ' ') {
                if (c >= 'A' && c <= 'Z') {
                    sb.append((char) ((c - 'A' + n) % 26 + 'A'));
                }
                else if (c >= 'a' && c <= 'z') {
                    sb.append((char) ((c - 'a' + n) % 26 + 'a'));
                }
            } else {
                sb.append(' ');
            }
        }

        return sb.toString();
    }
}
