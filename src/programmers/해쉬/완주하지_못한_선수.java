package programmers.해쉬;

import java.util.*;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant,completion));       // result -> leo

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant3,completion3));         // result -> mislav
    }

    public static String solution(String[] participant, String[] completion) {

        Map<String,Integer> map = new HashMap<>();

        for(String com : completion){
            map.put(com,map.getOrDefault(com,0)+1);
        }

        for(String par : participant){
            if(map.getOrDefault(par,0)==0){
                return par;
            }else{
                map.put(par, map.get(par)-1);
            }
        }
        return null;
    }
}
