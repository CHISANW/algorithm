package programmers.Re_Level_2;

import java.util.*;

public class 귤고르기 {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }

    static int solution(int k, int[] tangerine) {
        int count = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : list) {
            Integer npw = entry.getValue();
            if(k - npw > 0){
                k -= npw;
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}
