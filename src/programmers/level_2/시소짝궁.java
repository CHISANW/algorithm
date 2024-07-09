package programmers.level_2;

import java.util.*;

public class 시소짝궁 {
    public static void main(String[] args) {
        int[] weights = {100,180,360,100,270};
        System.out.println(solution(weights)); //result -> 4
    }
    public static long solution(int[] weights) {
        long answer = 0;

        Map<Double, Integer> map = new HashMap<>();
        Arrays.sort(weights);
        for(int weight : weights) {
            answer += helper(weight, map);
        }
        return answer;
    }

    public static long helper(int w, Map<Double, Integer> map) {
        long answer = 0;
        double d1 = w*1.0;
        double d2 = (w*2.0)/3.0;
        double d3 = (w*1.0)/2.0;
        double d4 = (w*3.0)/4.0;
        if(map.containsKey(d1)) answer += map.get(d1);
        if(map.containsKey(d2)) answer += map.get(d2);
        if(map.containsKey(d3)) answer += map.get(d3);
        if(map.containsKey(d4)) answer += map.get(d4);
        map.put(w*1.0, map.getOrDefault(w*1.0, 0)+1);
        return answer;
    }

}
