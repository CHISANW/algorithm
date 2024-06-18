package programmers.Level_1;

import java.util.*;

public class 달리기경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players,callings)));
    }

    public static String[] solution(String[] players, String[] callings) {
        List<String> playerList = new ArrayList<>(Arrays.asList(players));
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i<players.length;i++){
            map.put(players[i], i);
        }

        for(String str : callings){
            Integer index = map.get(str);
            if(index > 0){
                String temp = playerList.get(index - 1);
                playerList.set(index - 1, str);
                playerList.set(index, temp);

                map.put(str, index - 1);
                map.put(temp, index);

            }
        }
        return playerList.toArray(new String[0]);
    }

}
