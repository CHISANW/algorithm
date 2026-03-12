package programmers.Re_Level_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class hIndex {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,0,6,1,5}));

    }

    static int solution(int[] citations) {
        List<Integer> list = new LinkedList<>();

        int answer = 0;
        for(int i : citations){
            list.add(i);
        }

        list.sort(Collections.reverseOrder());

        for(int i =0 ;i<list.size();i++){        // i는 현재 논문 갯수(i+1)
            int value = list.get(i);     // 인용수
            int size = list.size();      // 총 논문수
            int mod = size - (i+1);      // 나머지 논문

            if(value >= i+1 && value>= mod ){
                answer = i+1;
            }
        }
        return answer;
    }
}
