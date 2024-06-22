package programmers.level_2;

import java.util.*;
public class 일차캐시 {
    public static void main(String[] args) {

        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize,cities)); //result -> 50
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> list = new LinkedList<>();



        if(cacheSize == 0){
            return cities.length * 5;
        }


        for(String str : cities){
            String city = str.toLowerCase();

            if(list.contains(city)){
                list.remove(city);
                list.add(city);
                answer+=1;
            }else{
                if(list.size() >= cacheSize){
                    list.remove(0);
                }
                list.add(city);
                answer+=5;
            }
        }

        return answer;

    }
}
