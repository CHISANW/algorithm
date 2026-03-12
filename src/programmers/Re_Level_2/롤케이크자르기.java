package programmers.Re_Level_2;

import java.util.*;

public class 롤케이크자르기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,1,3,1,4,1,2}));
        System.out.println(solution(new int[]{1, 2, 3, 1, 4}));

    }

    static int solution(int[] topping) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int j = 0; j<1;j++){
            map1.put(topping[j],map1.getOrDefault(topping[j],0)+1);
        }

        for(int j = 1; j<topping.length;j++){
            map2.put(topping[j],map2.getOrDefault(topping[j],0)+1);
        }

        int count =map1.size() == map2.size() ? 1 : 0;

        for(int i = 1; i<topping.length-1;i++){
            int key = topping[i];
            map1.put(key,map1.getOrDefault(key,0)+1);

            if(map2.containsKey(key)){
                Integer value = map2.get(key);
                if(value == 1) map2.remove(key);
                else map2.put(key,value-1);
            }

            if(map1.size() == map2.size()) count++;
        }
        return count;
    }
}
