package programmers.Level_1;

import java.util.HashMap;
import java.util.Map;

public class 가장많이받은선물 {
    public static void main(String[] args) {

        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};       //result - 2
        System.out.println(solution(friends,gifts));

        String[] friends1 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts1 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};                // result -> 4
        System.out.println(solution(friends1,gifts1));

    }
    public static int solution(String[] friends, String[] gifts) {

        int answer =0;
        int giftLength = friends.length;
        Map<String,Integer> map = new HashMap<>();
        int[] gift  = new int[giftLength];
        int[][] giftResult = new int[giftLength][giftLength];

        for(int i = 0; i<giftLength;i++){
            map.put(friends[i],i);
        }

        for(int i = 0; i<gifts.length;i++){
            String[] g = gifts[i].split(" ");
            String to  = g[0];
            String from  = g[1];
            gift[map.get(to)]++;
            gift[map.get(from)]--;
            giftResult[map.get(to)][map.get(from)]++;
        }

        for(int i = 0; i<giftLength;i++){
            int num =0;
            for(int j = 0; j<giftLength;j++){
                if(i == j) continue;

                if(giftResult[i][j] > giftResult[j][i] || (giftResult[i][j] == giftResult[j][i] && gift[i] > gift[j]))
                    num++;
            }

            if(answer<num){
                answer = num;
            }
        }

        return answer;
    }
}
