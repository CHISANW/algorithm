package programmers.Re_Level_2;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public static void main(String[] args) {

        String[][] clothes = {{"yellowhat","headgear"}, {"bluesunglasses","eyewear"}, {"green_turban","headgear"}};
        System.out.println(solution(clothes));
    }

    static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for(String[] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1],0)+1);
        }

        int answer = 1;

        for(int value : map.values()){
            answer *= (value+1);
        }
        return  answer - 1;

    }
}
