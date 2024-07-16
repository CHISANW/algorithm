package programmers.level_2;

public class 문자열압축 {
    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));           //result -> 7
        System.out.println(solution("ababcdcdababcdcd"));       //result -> 9
        System.out.println(solution("abcabcdede"));             //result -> 8
        System.out.println(solution("abcabcabcabcdededededede"));       //result -> 14
        System.out.println(solution("xababcdcdababcdcd"));          //result -> 17
    }

    static int solution(String s){
        int answer = s.length();

        for(int len = 1; len <= s.length() /2 ; len++){
            StringBuilder sb = new StringBuilder();
            String prev = s.substring(0, len);
            int count = 1;

            for (int j = len; j <= s.length(); j += len) {
                int end = Math.min(j + len, s.length());
                String current = s.substring(j, end);

                if(prev.equals(current)){
                    count++;
                }else{
                    if(count > 1){
                        sb.append(count).append(prev);
                    }else
                        sb.append(prev);
                    prev = current;
                    count = 1;
                }
            }
            if(count > 1)
                sb.append(count).append(prev);
            else
                sb.append(prev);
            answer= Math.min(answer, sb.length());

        }
        return answer;
    }
}
