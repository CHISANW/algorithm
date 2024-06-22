package programmers.level_2;

import java.util.*;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));      // result -> 5

        String[][] clothes1 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes1));     // result -> 3
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String,Integer> map = new HashMap<>();

        for(String[] cloth : clothes){
            String type = cloth[1];

            map.put(type, map.getOrDefault(type,0)+1);
        }

        for(int value : map.values()){
            answer *= (value+1);
        }

        return answer-1;
    }
}
