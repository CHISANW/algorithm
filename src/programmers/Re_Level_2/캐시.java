package programmers.Re_Level_2;

import java.util.*;

public class 캐시 {
    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));

    }

    public static int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;

        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(cacheSize, 0.75f, true);

        int count = 0;

        for (String city : cities) {
            String key = city.toLowerCase();

            if(cache.containsKey(key)){
                cache.get(key);
                count += 1;
            }else{
                if(cache.size() >= cacheSize){
                    cache.remove(cache.keySet().iterator().next());
                }
                cache.put(key, 1);
                count += 5;
            }

        }

        return count;
    }


}
