package programmers.Level_1;

import java.util.*;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant,completion));

    }

    static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : completion){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        for(String str : participant){
            if(!map.containsKey(str)){
                return str;
            }
            Integer now = map.get(str);
            if(now -1 == 0){
                map.remove(str);
            }else{
                map.put(str, now-1);
            }
        }

        return "";
    }
}
