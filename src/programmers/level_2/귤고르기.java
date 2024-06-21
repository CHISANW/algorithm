package programmers.level_2;

import java.util.*;

public class 귤고르기 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};  // result = 3;
        System.out.println(solution(k,tangerine));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
     HashMap<Integer,Integer> map = new HashMap<>();

     for(int i =0;i<tangerine.length;i++){
         map.put(tangerine[i], map.getOrDefault(tangerine[i],0)+1);
     }

     List<Integer> list = new ArrayList<>(map.values());
     list.sort(Collections.reverseOrder());

        int temp = 0;
        for (int count : list) {
            if (temp >= k) break;
            temp += count;
            answer++;
        }

        return answer;
    }
}
