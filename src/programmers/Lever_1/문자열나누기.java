package programmers.Lever_1;

public class 문자열나누기 {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(solution(s));    //result -> 3

        String s1 = "abracadabra";
        System.out.println(solution(s1));   //result -> 6
    }

    static int solution(String s) {
        int answer = 1;

        char x = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (count == 0) {
                answer++;
                x = s.charAt(i);
            }

            if (x == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
        }


        return answer;
    }
}
