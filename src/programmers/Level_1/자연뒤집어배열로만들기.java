package programmers.Level_1;

import java.util.*;

public class 자연뒤집어배열로만들기 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }

    static int[] solution(int n){

        List<Integer> ans = new ArrayList<>();

        char[] cmd = String.valueOf(n).toCharArray();

        for(char c : cmd){
            int a = c-'0';
            ans.add(a);
        }

        Collections.reverse(ans);

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}