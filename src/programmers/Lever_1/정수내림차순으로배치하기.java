package programmers.Lever_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 정수내림차순으로배치하기 {

    public static void main(String[] args) {
        int n = 118372;
        System.out.println(solution(n));
    }

    static long solution(int n){
        List<Integer> ans = new ArrayList<>();
        char[] cmd = String.valueOf(n).toCharArray();

        for(char c : cmd){
            int a = c -'0';
            ans.add(a);
        }

        Collections.sort(ans, (o1, o2) -> Integer.compare(o2, o1));

        int[] ss = ans.stream().mapToInt(Integer::intValue).toArray();
        StringBuilder sb = new StringBuilder();
        for(int s : ss){
            sb.append(s);
        }

        long long_answer  = Long.parseLong(sb.toString());
        return long_answer;
    }
}
